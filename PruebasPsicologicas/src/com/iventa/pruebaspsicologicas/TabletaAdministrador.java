package com.iventa.pruebaspsicologicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.iventa.pruebaspsicologicas.R;
import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioIndividual;

//@SuppressWarnings("unused")
public class TabletaAdministrador extends Activity implements OnClickListener {
    private FuenteCuestionarioIndividual fuenteDeCuestionarioIndividual; 
    private FuenteCuestionarioBasico fuenteDeCuestionarioBasico; 
    public String la_version;
	public String la_tableta;
	public String el_encuesto;
	private Spinner lista_de_archivos;
	private TextView texto_cantidad_de_registros;
	private Integer cantidad_de_registros_en_posicionador;
	private TextView texto_contenido_periodo;
	private TextView texto_contenido_hoy;
    private TextView monitor_01;
    private TextView monitor_02;
    private TextView monitor_03;
    private TextView monitor_04;
    private TextView monitor_05;
    private TextView monitor_06;
    private TextView monitor_07;
    private TextView monitor_08;
    private TextView monitor_09;
    private TextView monitor_10;
    private TextView monitor_11;
	private Button botonImportarBaseDeDatos;
	private Button botonExportarBaseDeDatos;
	private Button botonEliminarBaseDeDatos;
	private Button botonEnviarCorreo;
	private String nombre_del_paquete = "com.iventa.pruebaspsicologicas";
	private String importar_base_de_datos = "Importar base de datos";
	private String exportar_base_de_datos = "Exportar base de datos";
	private String eliminar_base_de_datos = "Eliminar base de datos";
	private String nombre_coloquial = " ";
	private String nombre_de_base_de_datos = " ";
	private String nombreArchivoAdjunto;
	private String archivoAdjunto;

    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableta_administrador);

        findViewById(R.id.botonImportarBaseDeDatos).setOnClickListener(this);
        findViewById(R.id.botonExportarBaseDeDatos).setOnClickListener(this);
        findViewById(R.id.botonEliminarBaseDeDatos).setOnClickListener(this);

        String[] datos = new String[]{"Seleccione la base de datos por procesar","Prospectos seleccionados","Cuestionario de morbilidad"};

        texto_cantidad_de_registros	= (TextView) findViewById(R.id.texto_cantidad_de_registros);
        texto_contenido_periodo		= (TextView) findViewById(R.id.texto_contenido_periodo);
        texto_contenido_hoy			= (TextView) findViewById(R.id.texto_contenido_hoy);
        monitor_01					= (TextView) findViewById(R.id.monitor_01);
        monitor_02					= (TextView) findViewById(R.id.monitor_02);
        monitor_03					= (TextView) findViewById(R.id.monitor_03);
        monitor_04					= (TextView) findViewById(R.id.monitor_04);
        monitor_05					= (TextView) findViewById(R.id.monitor_05);
        monitor_06					= (TextView) findViewById(R.id.monitor_06);
        monitor_07					= (TextView) findViewById(R.id.monitor_07);
        monitor_08					= (TextView) findViewById(R.id.monitor_08);
        monitor_09					= (TextView) findViewById(R.id.monitor_09);
        monitor_10					= (TextView) findViewById(R.id.monitor_10);
        monitor_11					= (TextView) findViewById(R.id.monitor_11);
        botonImportarBaseDeDatos	= (Button) findViewById(R.id.botonImportarBaseDeDatos);
        botonExportarBaseDeDatos	= (Button) findViewById(R.id.botonExportarBaseDeDatos);
        botonEliminarBaseDeDatos	= (Button) findViewById(R.id.botonEliminarBaseDeDatos);
        botonEnviarCorreo			= (Button) findViewById(R.id.botonEnviarCorreo);
        lista_de_archivos			= (Spinner)findViewById(R.id.lista_de_archivos);

        ArrayAdapter<String> adaptador_1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, datos);

        adaptador_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista_de_archivos.setAdapter(adaptador_1);

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this); 
        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 

        texto_cantidad_de_registros.setVisibility(-1);
        texto_contenido_periodo.setVisibility(1);
        texto_contenido_hoy.setVisibility(1);
		botonImportarBaseDeDatos.setVisibility(-1);
		botonExportarBaseDeDatos.setVisibility(-1);
		botonEliminarBaseDeDatos.setVisibility(-1);
		botonEnviarCorreo.setVisibility(1);

		fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 
		fuenteDeCuestionarioBasico.open();

		exhibe_registros();

		monitor_01.setText("Tableta n�mero: " + leer_tableta());
		monitor_02.setText("Nombre del fabricante: " + android.os.Build.MANUFACTURER);
		monitor_03.setText("Nombre del modelo: " + android.os.Build.MODEL);
		monitor_04.setText("Nombre del producto: " + android.os.Build.DEVICE);
//		monitor_05.setText("N�mero de serie: " + android.os.Build.SERIAL);
		monitor_06.setText("Ancho de la pantalla: " + getResources().getDisplayMetrics().widthPixels);
		monitor_07.setText("Alto de la pantalla: " + getResources().getDisplayMetrics().heightPixels);
		monitor_08.setText("Densidad de la pantalla (dpi): " + getResources().getDisplayMetrics().densityDpi);
		monitor_09.setText("Escala: " + Float.toString(getApplicationContext().getResources().getDisplayMetrics().density));
		monitor_11.setText("Sensores disponibles:" + "\n");

		// buscando los pixeles a partir de dips con la densidad
        int densidad = getResources().getDisplayMetrics().densityDpi;

        switch(densidad)
        	{
       		case 640: //XXXHDPI
       			monitor_10.setText("Pantalla de extra extra extra alta densidad 640 (XXXHDPI)");
       			break;
       		case 480: //XXHDPI
       			monitor_10.setText("Pantalla de extra extra alta densidad 480 (XXHDPI)");
       			break;
       		case 320: //XHDPI
       			monitor_10.setText("Pantalla de extra alta densidad 320 (XHDPI)");
       			break;
       		case 240: //HDPI
       			monitor_10.setText("Pantalla de alta densidad 240 (HDPI)");
       			break;
       		case 213: //TVDPI
       			monitor_10.setText("Pantalla de alta densidad 213 (TVDPI)");
       			break;
       		case 160: //MDPI
       			monitor_10.setText("Pantalla de mediana densidad 160 (MDPI)");
       			break;
       		case 120:  //LDPI
       			monitor_10.setText("Pantalla de baja densidad 120 (LDPI)");
       			break;
        }

        lista_de_archivos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parent, android.view.View v, int renglon, long id) {

        	switch(renglon) {
    			case 0:
    				nombre_coloquial = " ";
    				nombre_de_base_de_datos = " ";
    				texto_cantidad_de_registros.setVisibility(-1);
    				texto_contenido_periodo.setVisibility(1);
    				texto_contenido_hoy.setVisibility(1);
    				botonImportarBaseDeDatos.setVisibility(-1);
    				botonExportarBaseDeDatos.setVisibility(-1);
    				botonEliminarBaseDeDatos.setVisibility(-1);
    				botonImportarBaseDeDatos.setText(" ");
    				botonExportarBaseDeDatos.setText(" ");
    				botonEliminarBaseDeDatos.setText(" ");
    				botonEnviarCorreo.setVisibility(-1);
    				monitor_01.setVisibility(1);
    				monitor_02.setVisibility(1);
    				monitor_03.setVisibility(1);
    				monitor_04.setVisibility(1);
    				monitor_05.setVisibility(1);
    				monitor_06.setVisibility(1);
    				monitor_07.setVisibility(1);
    				monitor_08.setVisibility(1);
    				monitor_09.setVisibility(1);
    				monitor_10.setVisibility(1);
    				monitor_11.setVisibility(1);
    				break;
    			case 1:
    				nombre_coloquial = " de prospectos seleccionados";
    				nombre_de_base_de_datos = "CuestionarioIndividual";
    				texto_cantidad_de_registros.setVisibility(1);
    				texto_contenido_periodo.setVisibility(-1);
    				texto_contenido_hoy.setVisibility(-1);
    				botonImportarBaseDeDatos.setVisibility(1);
    				botonExportarBaseDeDatos.setVisibility(-1);
    				botonEliminarBaseDeDatos.setVisibility(1);
    				botonEnviarCorreo.setVisibility(-1);
    				botonImportarBaseDeDatos.setText(importar_base_de_datos + nombre_coloquial);
    				botonExportarBaseDeDatos.setText(" ");
    				botonEliminarBaseDeDatos.setText(eliminar_base_de_datos + nombre_coloquial);
    				monitor_01.setVisibility(-1);
    				monitor_02.setVisibility(-1);
    				monitor_03.setVisibility(-1);
    				monitor_04.setVisibility(-1);
    				monitor_05.setVisibility(-1);
    				monitor_06.setVisibility(-1);
    				monitor_07.setVisibility(-1);
    				monitor_08.setVisibility(-1);
    				monitor_09.setVisibility(-1);
    				monitor_10.setVisibility(-1);
    				monitor_11.setVisibility(-1);

    				cantidad_de_registros();
    				break;
        		case 2:
    				nombre_coloquial = " de cuestionarios de morbilidad";
        			nombre_de_base_de_datos = "CuestionarioBasico";
        	        texto_cantidad_de_registros.setVisibility(1);
        	        texto_contenido_periodo.setVisibility(-1);
        	        texto_contenido_hoy.setVisibility(-1);
               		botonImportarBaseDeDatos.setVisibility(-1);
               		botonExportarBaseDeDatos.setVisibility(1);
               		botonEliminarBaseDeDatos.setVisibility(1);
    				botonEnviarCorreo.setVisibility(1);
               		botonImportarBaseDeDatos.setText(" ");
               		botonExportarBaseDeDatos.setText(exportar_base_de_datos + nombre_coloquial);
               		botonEliminarBaseDeDatos.setText(eliminar_base_de_datos + nombre_coloquial);
               		botonEnviarCorreo.setText("Enviar correo" + nombre_coloquial);
    				monitor_01.setVisibility(-1);
    				monitor_02.setVisibility(-1);
    				monitor_03.setVisibility(-1);
    				monitor_04.setVisibility(-1);
    				monitor_05.setVisibility(-1);
    				monitor_06.setVisibility(-1);
    				monitor_07.setVisibility(-1);
    				monitor_08.setVisibility(-1);
    				monitor_09.setVisibility(-1);
    				monitor_10.setVisibility(-1);
    				monitor_11.setVisibility(-1);

    				cantidad_de_registros();
               		break;
        		}
        	}

        	public void onNothingSelected(AdapterView<?> parent) {
        	}
        });

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
       	List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

       	for(Sensor sensor: listaSensores) {
       		log(sensor.getName());
       	}
	} // Final de OnCreate


    public void onClick(View v) {
		switch(v.getId()) {
			case R.id.botonImportarBaseDeDatos:
				importarBaseDeDatos();
				importarBaseDeDatosDeHospitales();
				break;
			case R.id.botonExportarBaseDeDatos:
				exportarBaseDeDatos();
				break;
			case R.id.botonEliminarBaseDeDatos:
		    	dialogoVaciarBaseDeDatos();
				break;
		}
	}

    public void importarBaseDeDatos() {
		File sd = Environment.getExternalStorageDirectory();
        File data = Environment.getDataDirectory();
        FileChannel source = null;
        FileChannel destination = null;
        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/" + nombre_de_base_de_datos;
        String backupDBPath = nombre_de_base_de_datos;
        File currentDB = new File(data, currentDBPath);
        File backupDB = new File(sd, backupDBPath);
        try {
            source = new FileInputStream(backupDB).getChannel();
            destination = new FileOutputStream(currentDB).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
            Toast.makeText(this, "La base de datos " + nombre_de_base_de_datos + " ha sido importada", Toast.LENGTH_LONG).show();
        } catch(IOException e) {
        	e.printStackTrace();
        }

		cantidad_de_registros();
	}
	
    public void importarBaseDeDatosDeHospitales() {
		File sd = Environment.getExternalStorageDirectory();
        File data = Environment.getDataDirectory();
        FileChannel source = null;
        FileChannel destination = null;
//        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/" + nombre_de_base_de_datos;
//        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/Mtc/Soporte/Municipios";
        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/Hospitales";
        String backupDBPath = "Hospitales";
        File currentDB = new File(data, currentDBPath);
        File backupDB = new File(sd, backupDBPath);
        try {
            source = new FileInputStream(backupDB).getChannel();
            destination = new FileOutputStream(currentDB).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
//            Toast.makeText(this, "La base de datos " + nombre_de_base_de_datos + " ha sido importada", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "La base de datos Hospitales ha sido importada", Toast.LENGTH_LONG).show();
        } catch(IOException e) {
        	e.printStackTrace();
        }
	}

    public void exportarBaseDeDatos() {
		File sd = Environment.getExternalStorageDirectory();
        File data = Environment.getDataDirectory();
        FileChannel source = null;
        FileChannel destination = null;
        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/" + nombre_de_base_de_datos;
        String backupDBPath =  "/morbilidad/" + nombre_de_base_de_datos + " " + me_das_tu_ora() + " " + leer_tableta() + ".s3db";
        File currentDB = new File(data, currentDBPath);
        File backupDB = new File(sd, backupDBPath);
        try {
            source = new FileInputStream(currentDB).getChannel();
            destination = new FileOutputStream(backupDB).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
            Toast.makeText(this, "La base de datos " + nombre_de_base_de_datos + " ha sido exportada como " + backupDBPath, Toast.LENGTH_LONG).show();
        } catch(IOException e) {
        	e.printStackTrace();
        }
	}
	
    public void exportarArchivoAdjunto() {
		File sd = Environment.getExternalStorageDirectory();
        File data = Environment.getDataDirectory();
        FileChannel source = null;
        FileChannel destination = null;
        String currentDBPath = "/data/" + nombre_del_paquete + "/databases/" + nombre_de_base_de_datos;
//        String backupDBPath =  "/Mtc/" + nombre_de_base_de_datos + " " + me_das_tu_ora() + " " + leer_tableta() + ".s3db";
        nombreArchivoAdjunto =  nombre_de_base_de_datos + " " + me_das_tu_ora() + " " + leer_tableta() + ".s3db";
        archivoAdjunto =  "/morbilidad/" + nombreArchivoAdjunto;
        File currentDB = new File(data, currentDBPath);
        File backupDB = new File(sd, archivoAdjunto);
		monitor_11.append(archivoAdjunto + "\n");

        try {
            source = new FileInputStream(currentDB).getChannel();
            destination = new FileOutputStream(backupDB).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
            Toast.makeText(this, "La base de datos " + nombre_de_base_de_datos + " ha sido exportada como " + archivoAdjunto, Toast.LENGTH_LONG).show();
        } catch(IOException e) {
        	e.printStackTrace();
        }
	}

    public void eliminarBaseDeDatos() {
//		boolean resultado = this.deleteDatabase(nombre_de_base_de_datos);
//		if (resultado == true) {
//			 Toast.makeText(this, "La base de datos " + nombre_de_base_de_datos + " ha sido eliminada.", Toast.LENGTH_LONG).show();
//		} 
	}

	private Dialog dialogoVaciarBaseDeDatos() {
    	final String DEFAULT_YES = "Vaciar";
    	final String DEFAULT_NO = "Cancelar";

    	AlertDialog.Builder ventanaDeAlerta = new AlertDialog.Builder(this);
    	ventanaDeAlerta.setTitle("Va a vaciar una base de datos");
    	ventanaDeAlerta.setMessage("�En realidad desea vaciar la base de datos?");

    	ventanaDeAlerta.setPositiveButton(DEFAULT_YES, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialogInterface, int which) {

		    	if (nombre_de_base_de_datos == "CuestionarioIndividual") {
		    		fuenteDeCuestionarioIndividual.open(); 
		    		fuenteDeCuestionarioIndividual.vaciarCuestionarioIndividual(); 
		    	}

		    	if (nombre_de_base_de_datos == "CuestionarioBasico") {
		    		fuenteDeCuestionarioBasico.open(); 
		    		fuenteDeCuestionarioBasico.vaciarCuestionarioBasico(); 
		    	}

		    	dialogoConfirmacion();
				cantidad_de_registros();
				dialogInterface.cancel();
				}
			});

    	ventanaDeAlerta.setNegativeButton(DEFAULT_NO, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialogInterface, int which) {
				dialogInterface.cancel();
				}
			});

		return ventanaDeAlerta.show();
	}

	private Dialog dialogoConfirmacion() {
    	final String DEFAULT_YES = "Confirmado";

    	AlertDialog.Builder ventanaDeAlerta = new AlertDialog.Builder(this);
    	ventanaDeAlerta.setTitle("Aviso");
    	ventanaDeAlerta.setMessage("La base de datos " + nombre_de_base_de_datos + " ha sido vaciada.");

    	ventanaDeAlerta.setPositiveButton(DEFAULT_YES, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialogInterface, int which) {
				dialogInterface.cancel();
				}
			});

		return ventanaDeAlerta.show();
	}

	private String leer_tableta() {
		File sd = Environment.getExternalStorageDirectory();
		File f = new File(sd.getAbsolutePath(), "Tableta.txt");
		try {
			BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			la_tableta = fin.readLine();
			monitor_01.setText(la_tableta);
			fin.close();
		}
		catch (Exception ex) {
			Log.e("Ficheros", "Error al leer el archivo desde tarjeta SD");
		}
	
		return la_tableta;
	}

	private void cantidad_de_registros(){
		if (nombre_de_base_de_datos == "CuestionarioIndividual") {
			fuenteDeCuestionarioIndividual.open();
			texto_cantidad_de_registros.setText("Cantidad de registros = " + fuenteDeCuestionarioIndividual.cuentaRegistrosEnIndividual().toString());
		}

		if (nombre_de_base_de_datos == "CuestionarioBasico") {
			fuenteDeCuestionarioBasico.open();
			texto_cantidad_de_registros.setText("Cantidad de registros = " + fuenteDeCuestionarioBasico.cuentaRegistrosEnBasico().toString());
		}

		fuenteDeCuestionarioBasico.open(); 
		cantidad_de_registros_en_posicionador = fuenteDeCuestionarioBasico.cuentaRegistrosEnPosicionador(); 

		if (cantidad_de_registros_en_posicionador == 0) {
//			la_tableta = (String) monitor_01.getText();
			la_tableta = leer_tableta();
			el_encuesto = "Raul Ramirez Reyes";
			monitor_01.setText("Probando");
			fuenteDeCuestionarioBasico.open(); 
			fuenteDeCuestionarioBasico.crearRegistroPosicionador(la_tableta, el_encuesto);
		}

		fuenteDeCuestionarioBasico.open(); 
		String comando_00 = "SELECT posicion, tableta, encuesto FROM posicionador";
		String el_registro_leido[] = fuenteDeCuestionarioBasico.tomarTableta(comando_00);

		if (el_registro_leido[0] != null) {
			la_version = String.valueOf(el_registro_leido[0].toString());
			la_tableta = String.valueOf(el_registro_leido[1].toString());
			el_encuesto = String.valueOf(el_registro_leido[2].toString());
		}
	}

	public void exhibe_registros() {
		texto_contenido_periodo.setText("Entrevistas del per�odo:" + "\n");
		texto_contenido_periodo.append("Hombres = " + fuenteDeCuestionarioBasico.cuentaHombresPeriodoEnBasico().toString() + "\n");
		texto_contenido_periodo.append("Mujeres = " + fuenteDeCuestionarioBasico.cuentaMujeresPeriodoEnBasico().toString() + "\n");
//		texto_contenido_periodo.append("Muestras con sangre = " + fuenteDeCuestionarioBasico.cuentaSangrePeriodoEnBasico().toString() + "\n");
//		texto_contenido_periodo.append("Muestras con orina = " + fuenteDeCuestionarioBasico.cuentaPipiPeriodoEnBasico().toString() + "\n");
		texto_contenido_periodo.append("Cambios de domicilio = " + fuenteDeCuestionarioBasico.cuentaCambioDeDomicilioPeriodoEnBasico().toString() + "\n");
		texto_contenido_periodo.append("Fallecimientos = " + fuenteDeCuestionarioBasico.cuentaMortalidadPeriodoEnBasico().toString() + "\n");
		texto_contenido_periodo.append("No est�n en su domicilio = " + fuenteDeCuestionarioBasico.cuentaNoEnDomicilioPeriodoEnBasico().toString());

		texto_contenido_hoy.setText("Entrevistas de hoy:" + "\n");
		texto_contenido_hoy.append("Hombres = " + fuenteDeCuestionarioBasico.cuentaHombresHoyEnBasico().toString() + "\n");
		texto_contenido_hoy.append("Mujeres = " + fuenteDeCuestionarioBasico.cuentaMujeresHoyEnBasico().toString() + "\n");
//		texto_contenido_hoy.append("Muestras con sangre = " + fuenteDeCuestionarioBasico.cuentaSangreHoyEnBasico().toString() + "\n");
//		texto_contenido_hoy.append("Muestras con orina = " + fuenteDeCuestionarioBasico.cuentaPipiHoyEnBasico().toString() + "\n");
		texto_contenido_hoy.append("Cambios de domicilio = " + fuenteDeCuestionarioBasico.cuentaCambioDeDomicilioHoyEnBasico().toString() + "\n");
		texto_contenido_hoy.append("Fallecimientos = " + fuenteDeCuestionarioBasico.cuentaMortalidadHoyEnBasico().toString() + "\n");
		texto_contenido_hoy.append("No est�n en su domicilio = " + fuenteDeCuestionarioBasico.cuentaNoEnDomicilioHoyEnBasico().toString());
	}

	@SuppressLint("SimpleDateFormat")
	public String me_das_tu_ora() {
	    java.util.Date date= new java.util.Date();
	    String cadena_la_hora = new SimpleDateFormat("yyyyMMdd HHmmss").format(date.getTime());
		return cadena_la_hora;
	}

	public void enviarCorreo(View v) {
		exportarArchivoAdjunto();

		String asunto = "Correo de campo: " + nombreArchivoAdjunto + " de " + el_encuesto;

		//String[] TO = {"iventa.software@gmail.com, proyecto.coyoacan.2019@gmail.com"};
		//String[] CC = {"iventa@yahoo.com,iventa@hotmail.com"};
		String[] TO = {"morenorodrigo541@gmail.com"};
		String[] CC = {"rodrigodx_237@hotmail.com"};
		Uri uri = Uri.fromFile(new File(Environment.getExternalStorageDirectory().getAbsolutePath(), archivoAdjunto));
		Intent emailIntent = new Intent(Intent.ACTION_SEND);

		emailIntent.setData(Uri.parse("mailto:"));
//		emailIntent.setType("text/plain");
		emailIntent.setType("application/s3db");
		emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
		emailIntent.putExtra(Intent.EXTRA_CC, CC);
		emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
		emailIntent.putExtra(Intent.EXTRA_TEXT, "Hola. Este es un correo de campo y con archivo adjunto."); // * configurar email aqu�!
		emailIntent.putExtra(Intent.EXTRA_STREAM, uri);

		try {
			startActivity(Intent.createChooser(emailIntent, "Enviar correo electr�nico mediante:"));        
			Log.i("EMAIL", "Enviando email...");
			}

		catch (android.content.ActivityNotFoundException e) {
			Toast.makeText(this, "No existe ning�n cliente de email instalado.", Toast.LENGTH_SHORT).show();
			}
	}

	private void log(String string) {
		monitor_11.append(string + "\n");
	}

	public void ventanaAnterior(View v) {
		Intent i = new Intent(TabletaAdministrador.this, MainActivity.class);
		startActivity(i);
    }

    public void setListners(SensorManager sensorManager, SensorEventListener mEventListener) {
        sensorManager.registerListener(mEventListener, 
        		sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(mEventListener, 
        		sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),
                SensorManager.SENSOR_DELAY_NORMAL);
    }

}
