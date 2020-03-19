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
public class CuestionarioBarthel extends Activity{
	
    
    private RadioGroup radio_20;
	private RadioButton radio_20_opcion_01;
	private RadioButton radio_20_opcion_02;	
	private int seleccion_20 = 0; 
	private int seleccion_20_01 = 0; // Valor de la opci�n 01.
	private int seleccion_20_02 = 0; // Valor de la opci�n 02.
	private String tiempo_20;
    
	private RadioGroup radio_21;
	private RadioButton radio_21_opcion_01;
	private RadioButton radio_21_opcion_02;	
	private RadioButton radio_21_opcion_03;
	private int seleccion_21 = 0; 
	private int seleccion_21_01 = 0; // Valor de la opci�n 01.
	private int seleccion_21_02 = 0; // Valor de la opci�n 02.
	private int seleccion_21_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_21;
	
    private RadioGroup radio_22;
	private RadioButton radio_22_opcion_01;
	private RadioButton radio_22_opcion_02;	
	private int seleccion_22 = 0; 
	private int seleccion_22_01 = 0; // Valor de la opci�n 01.
	private int seleccion_22_02 = 0; // Valor de la opci�n 02.
	private String tiempo_22;
	
	private RadioGroup radio_23;
	private RadioButton radio_23_opcion_01;
	private RadioButton radio_23_opcion_02;	
	private RadioButton radio_23_opcion_03;
	private int seleccion_23 = 0; 
	private int seleccion_23_01 = 0; // Valor de la opci�n 01.
	private int seleccion_23_02 = 0; // Valor de la opci�n 02.
	private int seleccion_23_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_23;
	
	private RadioGroup radio_24;
	private RadioButton radio_24_opcion_01;
	private RadioButton radio_24_opcion_02;	
	private RadioButton radio_24_opcion_03;
	private int seleccion_24 = 0; 
	private int seleccion_24_01 = 0; // Valor de la opci�n 01.
	private int seleccion_24_02 = 0; // Valor de la opci�n 02.
	private int seleccion_24_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_24;
	
	private RadioGroup radio_25;
	private RadioButton radio_25_opcion_01;
	private RadioButton radio_25_opcion_02;	
	private RadioButton radio_25_opcion_03;
	private int seleccion_25 = 0; 
	private int seleccion_25_01 = 0; // Valor de la opci�n 01.
	private int seleccion_25_02 = 0; // Valor de la opci�n 02.
	private int seleccion_25_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_25;
	
	private RadioGroup radio_26;
	private RadioButton radio_26_opcion_01;
	private RadioButton radio_26_opcion_02;	
	private RadioButton radio_26_opcion_03;
	private RadioButton radio_26_opcion_04;
	private int seleccion_26 = 0; 
	private int seleccion_26_01 = 0; // Valor de la opci�n 01.
	private int seleccion_26_02 = 0; // Valor de la opci�n 02.
	private int seleccion_26_03 = 0; // Valor de la opci�n 03.
	private int seleccion_26_04 = 0; // Valor de la opci�n 03.	
	private String tiempo_26;
	
	private RadioGroup radio_27;
	private RadioButton radio_27_opcion_01;
	private RadioButton radio_27_opcion_02;	
	private RadioButton radio_27_opcion_03;
	private int seleccion_27 = 0; 
	private int seleccion_27_01 = 0; // Valor de la opci�n 01.
	private int seleccion_27_02 = 0; // Valor de la opci�n 02.
	private int seleccion_27_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_27;
	
	private RadioGroup radio_28;
	private RadioButton radio_28_opcion_01;
	private RadioButton radio_28_opcion_02;	
	private RadioButton radio_28_opcion_03;
	private int seleccion_28 = 0; 
	private int seleccion_28_01 = 0; // Valor de la opci�n 01.
	private int seleccion_28_02 = 0; // Valor de la opci�n 02.
	private int seleccion_28_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_28;
	
	private RadioGroup radio_29;
	private RadioButton radio_29_opcion_01;
	private RadioButton radio_29_opcion_02;	
	private RadioButton radio_29_opcion_03;
	private int seleccion_29 = 0; 
	private int seleccion_29_01 = 0; // Valor de la opci�n 01.
	private int seleccion_29_02 = 0; // Valor de la opci�n 02.
	private int seleccion_29_03 = 0; // Valor de la opci�n 03.	
	private String tiempo_29;
 //   RadioGroup radioGroupP20,radioGroupP21,radioGroupP22,radioGroupP23,radioGroupP24,radioGroupP25;
 //   RadioGroup radioGroupP26,radioGroupP27,radioGroupP28,radioGroupP29;
    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private String el_registro;
    private static String la_tableta;
    private static String el_encuesto;

    private Button btn_siguiente_barthel;
    private Button btn_abortar_barthel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_barthel);
		
		 Date date = new Date();
	     //   seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
	     //   seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";


	        radio_20 = (RadioGroup) findViewById(R.id.radio_20);
			radio_20_opcion_01	= (RadioButton) findViewById(R.id.radio_20_opcion_01);
			radio_20_opcion_02	= (RadioButton) findViewById(R.id.radio_20_opcion_02);
			
			radio_21 = (RadioGroup) findViewById(R.id.radio_21);
			radio_21_opcion_01	= (RadioButton) findViewById(R.id.radio_21_opcion_01);
			radio_21_opcion_02	= (RadioButton) findViewById(R.id.radio_21_opcion_02);
			radio_21_opcion_03	= (RadioButton) findViewById(R.id.radio_21_opcion_03);
			

		    radio_22 = (RadioGroup) findViewById(R.id.radio_22);
			radio_22_opcion_01	= (RadioButton) findViewById(R.id.radio_22_opcion_01);
			radio_22_opcion_02	= (RadioButton) findViewById(R.id.radio_22_opcion_02);
			
			radio_23 = (RadioGroup) findViewById(R.id.radio_23);
			radio_23_opcion_01	= (RadioButton) findViewById(R.id.radio_23_opcion_01);
			radio_23_opcion_02	= (RadioButton) findViewById(R.id.radio_23_opcion_02);
			radio_23_opcion_03	= (RadioButton) findViewById(R.id.radio_23_opcion_03);
			
			radio_24 = (RadioGroup) findViewById(R.id.radio_24);
			radio_24_opcion_01	= (RadioButton) findViewById(R.id.radio_24_opcion_01);
			radio_24_opcion_02	= (RadioButton) findViewById(R.id.radio_24_opcion_02);
			radio_24_opcion_03	= (RadioButton) findViewById(R.id.radio_24_opcion_03);
			
			radio_25 = (RadioGroup) findViewById(R.id.radio_25);
			radio_25_opcion_01	= (RadioButton) findViewById(R.id.radio_25_opcion_01);
			radio_25_opcion_02	= (RadioButton) findViewById(R.id.radio_25_opcion_02);
			radio_25_opcion_03	= (RadioButton) findViewById(R.id.radio_25_opcion_03);
			
			radio_26 = (RadioGroup) findViewById(R.id.radio_26);
			radio_26_opcion_01	= (RadioButton) findViewById(R.id.radio_26_opcion_01);
			radio_26_opcion_02	= (RadioButton) findViewById(R.id.radio_26_opcion_02);
			radio_26_opcion_03	= (RadioButton) findViewById(R.id.radio_26_opcion_03);
			radio_26_opcion_04	= (RadioButton) findViewById(R.id.radio_26_opcion_04);

			radio_27 = (RadioGroup) findViewById(R.id.radio_27);
			radio_27_opcion_01	= (RadioButton) findViewById(R.id.radio_27_opcion_01);
			radio_27_opcion_02	= (RadioButton) findViewById(R.id.radio_27_opcion_02);
			radio_27_opcion_03	= (RadioButton) findViewById(R.id.radio_27_opcion_03);
			
			radio_28 = (RadioGroup) findViewById(R.id.radio_28);
			radio_28_opcion_01	= (RadioButton) findViewById(R.id.radio_28_opcion_01);
			radio_28_opcion_02	= (RadioButton) findViewById(R.id.radio_28_opcion_02);
			radio_28_opcion_03	= (RadioButton) findViewById(R.id.radio_28_opcion_03);

			radio_29 = (RadioGroup) findViewById(R.id.radio_29);
			radio_29_opcion_01	= (RadioButton) findViewById(R.id.radio_29_opcion_01);
			radio_29_opcion_02	= (RadioButton) findViewById(R.id.radio_29_opcion_02);
			radio_29_opcion_03	= (RadioButton) findViewById(R.id.radio_29_opcion_03);
	        
			seleccion_20_01 = radio_20_opcion_01.getId();
			seleccion_20_02 = radio_20_opcion_02.getId();
			
			seleccion_21_01 = radio_21_opcion_01.getId();
			seleccion_21_02 = radio_21_opcion_02.getId();
			seleccion_21_03 = radio_21_opcion_03.getId();
			
			seleccion_22_01 = radio_22_opcion_01.getId();
			seleccion_22_02 = radio_22_opcion_02.getId();

			seleccion_23_01 = radio_23_opcion_01.getId();
			seleccion_23_02 = radio_23_opcion_02.getId();
			seleccion_23_03 = radio_23_opcion_03.getId();

			seleccion_24_01 = radio_24_opcion_01.getId();
			seleccion_24_02 = radio_24_opcion_02.getId();
			seleccion_24_03 = radio_24_opcion_03.getId();

			seleccion_25_01 = radio_25_opcion_01.getId();
			seleccion_25_02 = radio_25_opcion_02.getId();
			seleccion_25_03 = radio_25_opcion_03.getId();
			
			seleccion_26_01 = radio_26_opcion_01.getId();
			seleccion_26_02 = radio_26_opcion_02.getId();
			seleccion_26_03 = radio_26_opcion_03.getId();
			seleccion_26_04 = radio_26_opcion_04.getId();
			
			seleccion_27_01 = radio_27_opcion_01.getId();
			seleccion_27_02 = radio_27_opcion_02.getId();
			seleccion_27_03 = radio_27_opcion_03.getId();
			
			seleccion_28_01 = radio_28_opcion_01.getId();
			seleccion_28_02 = radio_28_opcion_02.getId();
			seleccion_28_03 = radio_28_opcion_03.getId();
			
			seleccion_29_01 = radio_29_opcion_01.getId();
			seleccion_29_02 = radio_29_opcion_02.getId();
			seleccion_29_03 = radio_29_opcion_03.getId();
			
			btn_siguiente_barthel = (Button) findViewById(R.id.siguiente_barthel_button);;
		    btn_abortar_barthel = (Button) findViewById(R.id.abortar_barthel_button);;
			
	        radio_20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_20_opcion_01.setChecked(false);
	                 radio_20_opcion_02.setChecked(false);
	                 tiempo_20 = me_das_tu_ora();
	                 if(seleccion_20_01 == checkedId)
	                 {
	                 	seleccion_20 = 1;              	
	                 }
	                 if(seleccion_20_02 == checkedId)
	                 {
	                 	seleccion_20 = 2;
	                 }
	            }
	        });
	        radio_21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_21_opcion_01.setChecked(false);
	                 radio_21_opcion_02.setChecked(false);
	                 radio_21_opcion_03.setChecked(false);
	                 tiempo_21 = me_das_tu_ora();
	                 if(seleccion_21_01 == checkedId)
	                 {
	                 	seleccion_21 = 1;              	
	                 }
	                 if(seleccion_21_02 == checkedId)
	                 {
	                 	seleccion_21 = 2;
	                 }
	                 if(seleccion_21_03 == checkedId)
	                 {
	                 	seleccion_21 = 3;
	                 }
	            }
	        });

	        radio_22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_22_opcion_01.setChecked(false);
	                 radio_22_opcion_02.setChecked(false);
	                 tiempo_22 = me_das_tu_ora();
	                 if(seleccion_22_01 == checkedId)
	                 {
	                 	seleccion_22 = 1;              	
	                 }
	                 if(seleccion_22_02 == checkedId)
	                 {
	                 	seleccion_22 = 2;
	                 }
	            }
	        });

	        radio_23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_23_opcion_01.setChecked(false);
	                 radio_23_opcion_02.setChecked(false);
	                 radio_23_opcion_03.setChecked(false);
	                 tiempo_23 = me_das_tu_ora();
	                 if(seleccion_23_01 == checkedId)
	                 {
	                 	seleccion_23 = 1;              	
	                 }
	                 if(seleccion_23_02 == checkedId)
	                 {
	                 	seleccion_23 = 2;
	                 }
	                 if(seleccion_23_03 == checkedId)
	                 {
	                 	seleccion_23 = 3;
	                 }            
	             }
	        });

	        radio_24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_24_opcion_01.setChecked(false);
	                 radio_24_opcion_02.setChecked(false);
	                 radio_24_opcion_03.setChecked(false);
	                 tiempo_24 = me_das_tu_ora();
	                 if(seleccion_24_01 == checkedId)
	                 {
	                 	seleccion_24= 1;              	
	                 }
	                 if(seleccion_24_02 == checkedId)
	                 {
	                 	seleccion_24 = 2;
	                 }
	                 if(seleccion_24_03 == checkedId)
	                 {
	                 	seleccion_24 = 3;
	                 }            
	           }
	            
	        });

	        radio_25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	radio_25_opcion_01.setChecked(false);
	                 radio_25_opcion_02.setChecked(false);
	                 radio_25_opcion_03.setChecked(false);
	                 tiempo_25 = me_das_tu_ora();
	                 if(seleccion_25_01 == checkedId)
	                 {
	                 	seleccion_25= 1;              	
	                 }
	                 if(seleccion_25_02 == checkedId)
	                 {
	                 	seleccion_25 = 2;
	                 }
	                 if(seleccion_25_03 == checkedId)
	                 {
	                 	seleccion_25 = 3;
	                 }  
	            }
	        });

	        radio_26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	 radio_26_opcion_01.setChecked(false);
	                 radio_26_opcion_02.setChecked(false);
	                 radio_26_opcion_03.setChecked(false);
	                 radio_26_opcion_04.setChecked(false);
	                 tiempo_26 = me_das_tu_ora();
	                 if(seleccion_26_01 == checkedId)
	                 {
	                 	seleccion_26 = 1;              	
	                 }
	                 if(seleccion_26_02 == checkedId)
	                 {
	                 	seleccion_26 = 2;
	                 }
	                 if(seleccion_26_03 == checkedId)
	                 {
	                 	seleccion_26 = 3;
	                 }
	                 if(seleccion_26_04 == checkedId)
	                 {
	                 	seleccion_26 = 4;
	                 }
	            }
	        });

	        radio_27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	radio_27_opcion_01.setChecked(false);
	                 radio_27_opcion_02.setChecked(false);
	                 radio_27_opcion_03.setChecked(false);
	                 tiempo_27 = me_das_tu_ora();
	                 if(seleccion_27_01 == checkedId)
	                 {
	                 	seleccion_27= 1;              	
	                 }
	                 if(seleccion_27_02 == checkedId)
	                 {
	                 	seleccion_27 = 2;
	                 }
	                 if(seleccion_27_03 == checkedId)
	                 {
	                 	seleccion_27 = 3;
	                 } 
	            }
	        });

	        radio_28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	radio_28_opcion_01.setChecked(false);
	                 radio_28_opcion_02.setChecked(false);
	                 radio_28_opcion_03.setChecked(false);
	                 tiempo_28 = me_das_tu_ora();
	                 if(seleccion_28_01 == checkedId)
	                 {
	                 	seleccion_28= 1;              	
	                 }
	                 if(seleccion_28_02 == checkedId)
	                 {
	                 	seleccion_28 = 2;
	                 }
	                 if(seleccion_28_03 == checkedId)
	                 {
	                 	seleccion_28 = 3;
	                 } 
	            }
	        });

	        radio_29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	           
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	            	radio_29_opcion_01.setChecked(false);
	                 radio_29_opcion_02.setChecked(false);
	                 radio_29_opcion_03.setChecked(false);
	                 tiempo_29 = me_das_tu_ora();
	                 if(seleccion_29_01 == checkedId)
	                 {
	                 	seleccion_29= 1;              	
	                 }
	                 if(seleccion_29_02 == checkedId)
	                 {
	                 	seleccion_29 = 2;
	                 }
	                 if(seleccion_29_03 == checkedId)
	                 {
	                 	seleccion_29 = 3;
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

	        String comando_1 = "SELECT p_2001, " +
	                "p_2101, p_2201,p_2301, p_2401, p_2501, " +
	                "p_2601, p_2701, p_2801, " +
	                "p_2901 " +
	                "FROM cuestionariobasico " +
	                "WHERE registro = " + "'" + el_registro + "'";

	        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0201(comando_1);
	        fuenteCuestionarioBasico.close();
	        if((matriz[0] != null)&& (matriz[1] != null)&&(matriz[2] != null)&&(matriz[3] != null)&&
	        		(matriz[4] != null)&& (matriz[5] != null)&& (matriz[6] != null) && (matriz[7] != null) &&
	        		(matriz[8] != null) && (matriz[9] != null))
	        {
	        	   
	        	Integer valor_2001 = Integer.valueOf(matriz[0].toString());
	           	Integer valor_2101 = Integer.valueOf(matriz[1].toString());
	           	Integer valor_2201 = Integer.valueOf(matriz[2].toString());
	           	Integer valor_2301 = Integer.valueOf(matriz[3].toString());
	           	Integer valor_2401 = Integer.valueOf(matriz[4].toString());
	           	Integer valor_2501 = Integer.valueOf(matriz[5].toString());
	           	Integer valor_2601 = Integer.valueOf(matriz[6].toString());
	           	Integer valor_2701 = Integer.valueOf(matriz[7].toString());
	           	Integer valor_2801 = Integer.valueOf(matriz[8].toString());
	           	Integer valor_2901 = Integer.valueOf(matriz[9].toString());

	           	if(valor_2001 > 0)
	        	{
	        		seleccion_20 = valor_2001;
	        		
	        		switch(valor_2001){
	        		case 1:
	        			radio_20_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_20_opcion_02.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2101 > 0)
	        	{
	        		seleccion_21 = valor_2101;
	        		
	        		switch(valor_2101){
	        		case 1:
	        			radio_21_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_21_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_21_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2201 > 0)
	        	{
	        		seleccion_22 = valor_2201;
	        		
	        		switch(valor_2201){
	        		case 1:
	        			radio_22_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_22_opcion_02.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2301 > 0)
	        	{
	        		seleccion_23 = valor_2301;
	        		
	        		switch(valor_2301){
	        		case 1:
	        			radio_23_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_23_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_23_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}

	           	if(valor_2401 > 0)
	        	{
	        		seleccion_24 = valor_2401;
	        		
	        		switch(valor_2401){
	        		case 1:
	        			radio_24_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_24_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_24_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2501 > 0)
	        	{
	        		seleccion_25 = valor_2501;
	        		
	        		switch(valor_2501){
	        		case 1:
	        			radio_25_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_25_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_25_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2601 > 0)
	        	{
	        		seleccion_26 = valor_2601;
	        		
	        		switch(valor_2601){
	        		case 1:
	        			radio_26_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_26_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_26_opcion_03.setChecked(true);
	        			break;
	        		case 4:
	        			radio_26_opcion_04.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2701 > 0)
	        	{
	        		seleccion_27 = valor_2701;
	        		
	        		switch(valor_2701){
	        		case 1:
	        			radio_27_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_27_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_27_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}

	           	if(valor_2801 > 0)
	        	{
	        		seleccion_28 = valor_2801;
	        		
	        		switch(valor_2801){
	        		case 1:
	        			radio_28_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_28_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_28_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}
	           	
	           	if(valor_2901 > 0)
	        	{
	        		seleccion_29 = valor_2901;
	        		
	        		switch(valor_2901){
	        		case 1:
	        			radio_29_opcion_01.setChecked(true);
	        			break;
	        		case 2:
	        			radio_29_opcion_02.setChecked(true);
	        			break;
	        		case 3:
	        			radio_29_opcion_03.setChecked(true);
	        			break;
	        		}
	        	}


	        }

	        
	        btn_siguiente_barthel.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// TODO Auto-generated method stub
					siguienteBarthel(view);
				}
			});
		    btn_abortar_barthel.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View view) {
					// TODO Auto-generated method stub
					barthelAbortar(view);
				}
			});
	}
	
	public void siguienteBarthel(View view){
        Intent finbar = new Intent(this,CuestionarioMiniMentalPrimero.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", p_2001";
        String comando_02 = ", t_2001";
        String comando_03  = ", p_2101";
        String comando_04 = ", t_2101";
        String comando_05  = ", p_2201";
        String comando_06 = ", t_2201";
        String comando_07  = ", p_2301";
        String comando_08 = ", t_2301";
        String comando_09  = ", p_2401";
        String comando_10 = ", t_2401";
        String comando_11  = ", p_2501";
        String comando_12 = ", t_2501";
        String comando_13  = ", p_2601";
        String comando_14 = ", t_2601";
        String comando_15 = ", p_2701";
        String comando_16 = ", t_2701";
        String comando_17 = ", p_2801";
        String comando_18 = ", t_2801";
        String comando_19 = ", p_2901";
        String comando_20 = ", t_2901";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
                comando_01, seleccion_20,
                comando_02, tiempo_20,
                comando_03, seleccion_21,
                comando_04, tiempo_21,
                comando_05, seleccion_22,
                comando_06, tiempo_22,
                comando_07, seleccion_23,
                comando_08, tiempo_23,
                comando_09, seleccion_24,
                comando_10, tiempo_24,
                comando_11, seleccion_25,
                comando_12, tiempo_25,
                comando_13, seleccion_26,
                comando_14, tiempo_26,
                comando_15, seleccion_27,
                comando_16, tiempo_27,
                comando_17, seleccion_28,
                comando_18, tiempo_28,
                comando_19, seleccion_29,
                comando_20, tiempo_29,
                comando_50);
        startActivity(finbar);
    }
	
	public void barthelAbortar(View view){
        Intent barthelabortar = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", p_2001";
        String comando_02 = ", t_2001";
        String comando_03  = ", p_2101";
        String comando_04 = ", t_2101";
        String comando_05  = ", p_2201";
        String comando_06 = ", t_2201";
        String comando_07  = ", p_2301";
        String comando_08 = ", t_2301";
        String comando_09  = ", p_2401";
        String comando_10 = ", t_2401";
        String comando_11  = ", p_2501";
        String comando_12 = ", t_2501";
        String comando_13  = ", p_2601";
        String comando_14 = ", t_2601";
        String comando_15 = ", p_2701";
        String comando_16 = ", t_2701";
        String comando_17 = ", p_2801";
        String comando_18 = ", t_2801";
        String comando_19 = ", p_2901";
        String comando_20 = ", t_2901";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
                comando_01, seleccion_20,
                comando_02, tiempo_20,
                comando_03, seleccion_21,
                comando_04, tiempo_21,
                comando_05, seleccion_22,
                comando_06, tiempo_22,
                comando_07, seleccion_23,
                comando_08, tiempo_23,
                comando_09, seleccion_24,
                comando_10, tiempo_24,
                comando_11, seleccion_25,
                comando_12, tiempo_25,
                comando_13, seleccion_26,
                comando_14, tiempo_26,
                comando_15, seleccion_27,
                comando_16, tiempo_27,
                comando_17, seleccion_28,
                comando_18, tiempo_28,
                comando_19, seleccion_29,
                comando_20, tiempo_29,
                comando_50);
        barthelabortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        barthelabortar.putExtra("EXIT", true);
        startActivity(barthelabortar);

    }
	
	
	   public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }
}