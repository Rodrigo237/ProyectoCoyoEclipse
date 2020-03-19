package com.iventa.pruebaspsicologicas;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint({ "SimpleDateFormat", "Registered" })
public class CuestionarioSeleccionSegundo extends Activity{
	

	private RadioGroup radio_10;
	private RadioButton radio_10_opcion_01;	
	private RadioButton radio_10_opcion_02;
	private RadioButton radio_10_opcion_03;	
	private RadioButton radio_10_opcion_04;	
	private RadioButton radio_10_opcion_05;	
	private int seleccion_10 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_10_01 = 0; // Valor de la opci�n 01.
	private int seleccion_10_02 = 0; // Valor de la opci�n 02.
	private int seleccion_10_03 = 0; // Valor de la opci�n 03.
	private int seleccion_10_04 = 0; // Valor de la opci�n 04.
	private int seleccion_10_05 = 0; // Valor de la opci�n 05.
	private String tiempo_10;
    
	private RadioGroup radio_11;
	private RadioButton radio_11_opcion_01;	// nunca1
	private RadioButton radio_11_opcion_02;	// muy1
	private RadioButton radio_11_opcion_03;	// algunas1
	private RadioButton radio_11_opcion_04;	// casisiempre1
	private RadioButton radio_11_opcion_05;	// siempre1
	private int seleccion_11 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_11_01 = 0; // Valor de la opci�n 01.
	private int seleccion_11_02 = 0; // Valor de la opci�n 02.
	private int seleccion_11_03 = 0; // Valor de la opci�n 03.
	private int seleccion_11_04 = 0; // Valor de la opci�n 04.
	private int seleccion_11_05 = 0; // Valor de la opci�n 05.
	private String tiempo_11;
	
	
	private RadioGroup radio_12;
	private RadioButton radio_12_opcion_01;	// nunca1
	private RadioButton radio_12_opcion_02;	// muy1
	private RadioButton radio_12_opcion_03;	// algunas1
	private RadioButton radio_12_opcion_04;	// casisiempre1
	private RadioButton radio_12_opcion_05;	// siempre1
	private int seleccion_12 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_12_01 = 0; // Valor de la opci�n 01.
	private int seleccion_12_02 = 0; // Valor de la opci�n 02.
	private int seleccion_12_03 = 0; // Valor de la opci�n 03.
	private int seleccion_12_04 = 0; // Valor de la opci�n 04.
	private int seleccion_12_05 = 0; // Valor de la opci�n 05.
	private String tiempo_12;
	
	private Button btn_seleccion_segundo;
	private Button btn_seleccion_segundo_abortar;
    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private static String la_tableta;
    private static String el_encuesto;
    private String el_registro;
    private  String la_cadena;
 
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_seleccion_segundo);
	
		//  Date date = new Date();
	      //  seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
	      //  seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

	        radio_10			= (RadioGroup) findViewById(R.id.radio_10);
			radio_10_opcion_01	= (RadioButton) findViewById(R.id.radio_01_opcion_01);
			radio_10_opcion_02	= (RadioButton) findViewById(R.id.radio_10_opcion_02);
			radio_10_opcion_03	= (RadioButton) findViewById(R.id.radio_10_opcion_03);
			radio_10_opcion_04	= (RadioButton) findViewById(R.id.radio_10_opcion_04);
			radio_10_opcion_05	= (RadioButton) findViewById(R.id.radio_10_opcion_05);

		 	radio_11 = (RadioGroup) findViewById(R.id.radio_11);
			radio_11_opcion_01	= (RadioButton) findViewById(R.id.radio_11_opcion_01);
			radio_11_opcion_02	= (RadioButton) findViewById(R.id.radio_11_opcion_02);
			radio_11_opcion_03	= (RadioButton) findViewById(R.id.radio_11_opcion_03);
			radio_11_opcion_04	= (RadioButton) findViewById(R.id.radio_11_opcion_04);
			radio_11_opcion_05	= (RadioButton) findViewById(R.id.radio_11_opcion_05);

            radio_12 = (RadioGroup) findViewById(R.id.radio_12);
			radio_12_opcion_01	= (RadioButton) findViewById(R.id.radio_12_opcion_01);
			radio_12_opcion_02	= (RadioButton) findViewById(R.id.radio_12_opcion_02);
			radio_12_opcion_03	= (RadioButton) findViewById(R.id.radio_12_opcion_03);
			radio_12_opcion_04	= (RadioButton) findViewById(R.id.radio_12_opcion_04);
			radio_12_opcion_05	= (RadioButton) findViewById(R.id.radio_12_opcion_05);


			seleccion_10_01 = radio_10_opcion_01.getId();
			seleccion_10_02 = radio_10_opcion_02.getId();
			seleccion_10_03 = radio_10_opcion_03.getId();
			seleccion_10_04 = radio_10_opcion_04.getId();
			seleccion_10_05 = radio_10_opcion_05.getId();
			seleccion_11_01 = radio_11_opcion_01.getId();
			seleccion_11_02 = radio_11_opcion_02.getId();
			seleccion_11_03 = radio_11_opcion_03.getId();
			seleccion_11_04 = radio_11_opcion_04.getId();
			seleccion_11_05 = radio_11_opcion_05.getId();
			seleccion_12_01 = radio_12_opcion_01.getId();
			seleccion_12_02 = radio_12_opcion_02.getId();
			seleccion_12_03 = radio_12_opcion_03.getId();
			seleccion_12_04 = radio_12_opcion_04.getId();
			seleccion_12_05 = radio_12_opcion_05.getId();
	
			btn_seleccion_segundo = (Button)findViewById(R.id.btn_seleccion_segundo);
			btn_seleccion_segundo_abortar = (Button)findViewById(R.id.btn_select_segundo_abortar);
	        
	        radio_10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_10_opcion_01.setChecked(false);
	                 radio_10_opcion_02.setChecked(false);
	                 radio_10_opcion_03.setChecked(false);
	                 radio_10_opcion_04.setChecked(false);
	                 radio_10_opcion_05.setChecked(false);
	                 tiempo_10 = me_das_tu_ora();
	                 if(seleccion_10_01 == checkedId)
	                 {
	                 	seleccion_10 = 1;              	
	                 }
	                 if(seleccion_10_02 == checkedId)
	                 {
	                 	seleccion_10 = 2;
	                 }
	                 if(seleccion_10_03 == checkedId)
	                 {
	                 	seleccion_10 = 3;
	                 }
	                 if(seleccion_10_04 == checkedId)
	                 {
	                 	seleccion_10 = 4;
	                 }
	                 if(seleccion_10_05 == checkedId)
	                 {
	                 	seleccion_10 = 5;
	                 }
	            }
	        });

	        radio_11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	tiempo_11 = me_das_tu_ora();
	                if(seleccion_11_01 == checkedId)
	                {
	                	seleccion_11 = 1;              	
	                }
	                if(seleccion_11_02 == checkedId)
	                {
	                	seleccion_11 = 2;
	                }
	                if(seleccion_11_03 == checkedId)
	                {
	                	seleccion_11 = 3;
	                }
	                if(seleccion_11_04 == checkedId)
	                {
	                	seleccion_11 = 4;
	                }
	                if(seleccion_11_05 == checkedId)
	                {
	                	seleccion_11 = 5;
	                }
	            }
	        });

	        radio_12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	tiempo_12 = me_das_tu_ora();
	                if(seleccion_12_01 == checkedId)
	                {
	                	seleccion_12 = 1;              	
	                }
	                if(seleccion_12_02 == checkedId)
	                {
	                	seleccion_12 = 2;
	                }
	                if(seleccion_12_03 == checkedId)
	                {
	                	seleccion_12 = 3;
	                }
	                if(seleccion_12_04 == checkedId)
	                {
	                	seleccion_12 = 4;
	                }
	                if(seleccion_12_05 == checkedId)
	                {
	                	seleccion_12 = 5;
	                }
	            }
	        });
	        
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();
	        String comando_00 = "SELECT registro, tableta, encuesto FROM posicionador";
	        String el_registro_leido[] = fuenteCuestionarioBasico.tomarEncuesto(comando_00);
	        if (el_registro_leido[0] != null) {
	            el_registro = String.valueOf(el_registro_leido[0].toString());
	            la_tableta = String.valueOf(el_registro_leido[1].toString());
	            el_encuesto = String.valueOf(el_registro_leido[2].toString());
	        }

	        String comando_0 = "SELECT nombre, paterno, materno FROM cuestionariobasico WHERE registro = " + "'" + el_registro + "'";
	        String identificacion[] = fuenteCuestionarioBasico.tomarNombre(comando_0);

	        if ((identificacion[0] != null) && (identificacion[1] != null )) {
	            String el_nombre = String.valueOf(identificacion[0].toString());
	            String el_paterno = String.valueOf(identificacion[1].toString());
	            String el_materno = String.valueOf(identificacion[2].toString());

	            if ((el_nombre.length() > 0) && (el_paterno.length() > 0) && (el_materno.length() > 0)) {
	                //  exhibe_nombre.setText("Registro de:" + el_nombre.trim() + " " + el_paterno.trim() + " " + el_materno.trim());
	            }
	        }

	        String comando_1 = "SELECT p_1001, " +
	                "t_1001, p_1101, t_1101, p_1201, t_1201, " +
	                "FROM cuestionariobasico " +
	                "WHERE registro = " + "'" + el_registro + "'";

	        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0102(comando_1);
	        fuenteCuestionarioBasico.close();
	        
	        if((matriz[0] != null) && (matriz[1] != null) && (matriz[2] != null) )
	        {
	        	Integer valor_1001 = Integer.valueOf(matriz[0].toString());
	        	Integer valor_1101 = Integer.valueOf(matriz[1].toString());
	        	Integer valor_1201 = Integer.valueOf(matriz[2].toString());
	       

	        	if(valor_1001 > 0)
	        	{
	        		seleccion_10 = valor_1001;
	        		
	        		switch(valor_1001){
	        		case 1:
	        			radio_10_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_10_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_10_opcion_03.setChecked(true);
	        			break;
	        		case 4:
	        			radio_10_opcion_04.setChecked(true);
	        			break;
	        		case 5:
	        			radio_10_opcion_05.setChecked(true);
	        			break;
	        		}
	        	}
	        	

	        	if(valor_1101 > 0)
	        	{
	        		seleccion_11 = valor_1101;
	        		
	        		switch(valor_1101){
	        		case 1:
	        			radio_11_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_11_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_11_opcion_03.setChecked(true);
	        			break;
	        		case 4:
	        			radio_11_opcion_04.setChecked(true);
	        			break;
	        		case 5:
	        			radio_11_opcion_05.setChecked(true);
	        			break;
	        		}
	        		

	            	if(valor_1201 > 0)
	            	{
	            		seleccion_12 = valor_1201;
	            		
	            		switch(valor_1201){
	            		case 1:
	            			radio_12_opcion_01.setChecked(true);
	            			break;
	            		case 2:
	            			radio_12_opcion_02.setChecked(true);
	            			break;
	            		case 3:
	            			radio_12_opcion_03.setChecked(true);
	            			break;
	            		case 4:
	            			radio_12_opcion_04.setChecked(true);
	            			break;
	            		case 5:
	            			radio_12_opcion_05.setChecked(true);
	            			break;
	            		}
	            	}
	        	}
	        }
	        
	        btn_seleccion_segundo.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// TODO Auto-generated method stub
					siguienteSeleccionSegundo(view);
				}
			});
	        
	        btn_seleccion_segundo_abortar.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// TODO Auto-generated method stub
				abortarSeleccionSegundo(view);	
				}
			});
	}
	
	 public void siguienteSeleccionSegundo(View view)
	    {
	        Intent seleccion = new Intent(this,CuestionarioDepresion.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();

	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01 = "  p_1001 = ";
	        String comando_02 = ", t_1001 = ";
	        String comando_03 = ", p_1101 = ";
	        String comando_04 = ", t_1101 = ";
	        String comando_05 = ", p_1201 = ";
	        String comando_06 = ", t_1202 = ";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0102(comando_00,
	                comando_01,  seleccion_10,
	                comando_02,  tiempo_10,
	                comando_03,  seleccion_11,
	                comando_04,  tiempo_11,
	                comando_05,  seleccion_12,
	                comando_06, tiempo_12,
	                comando_50);

	        startActivity(seleccion);
	    }
	
	 public void abortarSeleccionSegundo(View view)
	    {
	        Intent abortarseleccion = new Intent(this,MainActivity.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();

	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01 = "  p_1001 = ";
	        String comando_02 = ", t_1001 = ";
	        String comando_03 = ", p_1101 = ";
	        String comando_04 = ", t_1101 = ";
	        String comando_05 = ", p_1201 = ";
	        String comando_06 = ", t_1202 = ";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0102(comando_00,
	        		 comando_01,  seleccion_10,
		                comando_02,  tiempo_10,
		                comando_03,  seleccion_11,
		                comando_04,  tiempo_11,
		                comando_05,  seleccion_12,
		                comando_06, tiempo_12,
	                comando_50);

	        startActivity(abortarseleccion);
	    }
	 
	  public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }
}
