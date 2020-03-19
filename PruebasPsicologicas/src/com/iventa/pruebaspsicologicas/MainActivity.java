package com.iventa.pruebaspsicologicas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioIndividual;
import com.iventa.pruebaspsicologicas.R;

@SuppressWarnings("unused")
public class MainActivity extends Activity {

    private FuenteCuestionarioIndividual fuenteDeCuestionarioIndividual; 
    private FuenteCuestionarioBasico fuenteDeCuestionarioBasico;
    private Button botonBuscarProspectos;
    private Button botonBuscarCuestionario;
	private Integer cantidad_de_registros_en_individual;
	private Integer cantidad_de_registros_en_basico;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
		fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);

		botonBuscarProspectos		= (Button) findViewById(R.id.botonBuscarProspectos);
		botonBuscarCuestionario		= (Button) findViewById(R.id.botonBuscarCuestionario);

		fuenteDeCuestionarioBasico.open();
		fuenteDeCuestionarioBasico.checarRegistroPosicionador();

		cantidad_de_registros();
	}

	private void cantidad_de_registros(){
		fuenteDeCuestionarioIndividual.open(); 
		cantidad_de_registros_en_individual = fuenteDeCuestionarioIndividual.cuentaRegistrosEnIndividual(); 

		if (cantidad_de_registros_en_individual == 0) {
			botonBuscarProspectos.setEnabled(false);
			botonBuscarProspectos.setText("Archivo de prospectos vac�o");
		}

		if (cantidad_de_registros_en_individual > 0) {
			botonBuscarProspectos.setEnabled(true);
			botonBuscarProspectos.setText(R.string.boton_buscar_prospectos);
		}

		fuenteDeCuestionarioBasico.open();
		cantidad_de_registros_en_basico = fuenteDeCuestionarioBasico.cuentaRegistrosEnBasico(); 

		if (cantidad_de_registros_en_basico == 0) {
			botonBuscarCuestionario.setEnabled(false);
			botonBuscarCuestionario.setText("Archivo de cuestionarios vac�o");
		}

		if (cantidad_de_registros_en_basico > 0) {
			botonBuscarCuestionario.setEnabled(true);
			botonBuscarCuestionario.setText(R.string.boton_buscar_cuestionario);
		}
	}

	public void buscarProspecto(View v) {
		Intent i = new Intent(MainActivity.this, TabletaBuscarProspecto.class);
		startActivity(i);
    }

	public void buscarCuestionario(View v) {
		Intent i = new Intent(MainActivity.this, TabletaBuscarCuestionario.class);
		startActivity(i);
    }

	public void administradorDeBasesDeDatos(View v) {
		Intent i = new Intent(MainActivity.this, TabletaAdministrador.class);
		startActivity(i);
    }

	public void salir(View v){ 
		Intent a = new Intent(Intent.ACTION_MAIN);
		a.addCategory(Intent.CATEGORY_HOME);
		a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(a);
	}
}

