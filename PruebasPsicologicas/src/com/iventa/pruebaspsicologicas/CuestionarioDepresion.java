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
public class CuestionarioDepresion extends Activity{
	
	// RadioButton rara13,pocas13,considerable13,todo13;
	//    RadioButton rara14,pocas14,considerable14,todo14;
	//    RadioButton rara15,pocas15,considerable15,todo15;
	//    RadioButton rara16,pocas16,considerable16,todo16;
	//    RadioButton rara17,pocas17,considerable17,todo17;
	//    RadioButton rara18,pocas18,considerable18,todo18;
	//    RadioButton rara19,pocas19,considerable19,todo19;
	 FuenteCuestionarioBasico fuenteCuestionarioBasico;
	 
	private RadioGroup radio_13;
	private RadioButton radio_13_opcion_01;	// nunca1
	private RadioButton radio_13_opcion_02;	// muy1
	private RadioButton radio_13_opcion_03;	// algunas1
	private RadioButton radio_13_opcion_04;	// casisiempre1
	private int seleccion_13 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_13_01 = 0; // Valor de la opci�n 01.
	private int seleccion_13_02 = 0; // Valor de la opci�n 02.
	private int seleccion_13_03 = 0; // Valor de la opci�n 03.
	private int seleccion_13_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_13;
	
	private RadioGroup radio_14;
	private RadioButton radio_14_opcion_01;	// nunca1
	private RadioButton radio_14_opcion_02;	// muy1
	private RadioButton radio_14_opcion_03;	// algunas1
	private RadioButton radio_14_opcion_04;	// casisiempre1
	private int seleccion_14 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_14_01 = 0; // Valor de la opci�n 01.
	private int seleccion_14_02 = 0; // Valor de la opci�n 02.
	private int seleccion_14_03 = 0; // Valor de la opci�n 03.
	private int seleccion_14_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_14;
	
	private RadioGroup radio_15;
	private RadioButton radio_15_opcion_01;	// nunca1
	private RadioButton radio_15_opcion_02;	// muy1
	private RadioButton radio_15_opcion_03;	// algunas1
	private RadioButton radio_15_opcion_04;	// casisiempre1
	private int seleccion_15 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_15_01 = 0; // Valor de la opci�n 01.
	private int seleccion_15_02 = 0; // Valor de la opci�n 02.
	private int seleccion_15_03 = 0; // Valor de la opci�n 03.
	private int seleccion_15_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_15;
	
	private RadioGroup radio_16;
	private RadioButton radio_16_opcion_01;	// nunca1
	private RadioButton radio_16_opcion_02;	// muy1
	private RadioButton radio_16_opcion_03;	// algunas1
	private RadioButton radio_16_opcion_04;	// casisiempre1
	private int seleccion_16 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_16_01 = 0; // Valor de la opci�n 01.
	private int seleccion_16_02 = 0; // Valor de la opci�n 02.
	private int seleccion_16_03 = 0; // Valor de la opci�n 03.
	private int seleccion_16_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_16;
	
	private RadioGroup radio_17;
	private RadioButton radio_17_opcion_01;	// nunca1
	private RadioButton radio_17_opcion_02;	// muy1
	private RadioButton radio_17_opcion_03;	// algunas1
	private RadioButton radio_17_opcion_04;	// casisiempre1
	private int seleccion_17 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_17_01 = 0; // Valor de la opci�n 01.
	private int seleccion_17_02 = 0; // Valor de la opci�n 02.
	private int seleccion_17_03 = 0; // Valor de la opci�n 03.
	private int seleccion_17_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_17;
	
	private RadioGroup radio_18;
	private RadioButton radio_18_opcion_01;	// nunca1
	private RadioButton radio_18_opcion_02;	// muy1
	private RadioButton radio_18_opcion_03;	// algunas1
	private RadioButton radio_18_opcion_04;	// casisiempre1
	private int seleccion_18 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_18_01 = 0; // Valor de la opci�n 01.
	private int seleccion_18_02 = 0; // Valor de la opci�n 02.
	private int seleccion_18_03 = 0; // Valor de la opci�n 03.
	private int seleccion_18_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_18;
	
	private RadioGroup radio_19;
	private RadioButton radio_19_opcion_01;	// nunca1
	private RadioButton radio_19_opcion_02;	// muy1
	private RadioButton radio_19_opcion_03;	// algunas1
	private RadioButton radio_19_opcion_04;	// casisiempre1
	private int seleccion_19 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_19_01 = 0; // Valor de la opci�n 01.
	private int seleccion_19_02 = 0; // Valor de la opci�n 02.
	private int seleccion_19_03 = 0; // Valor de la opci�n 03.
	private int seleccion_19_04 = 0; // Valor de la opci�n 04.
	
	private String tiempo_19;
	
	//    RadioGroup radioGroupP13,radioGroupP14,radioGroupP15,radioGroupP16,radioGroupP17;
	//    RadioGroup radioGroupP18,radioGroupP19;
	    
	    private static String la_tableta;
	    private static String el_encuesto;
	    private String el_registro;
	    
	    private Button btn_depresion_siguiente;
	    private Button btn_depresion_abortar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_depresion);
		

        Date date = new Date();
   //     seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
     //   seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";


        radio_13 = (RadioGroup) findViewById(R.id.radio_13);
		radio_13_opcion_01	= (RadioButton) findViewById(R.id.radio_13_opcion_01);
		radio_13_opcion_02	= (RadioButton) findViewById(R.id.radio_13_opcion_02);
		radio_13_opcion_03	= (RadioButton) findViewById(R.id.radio_13_opcion_03);
		radio_13_opcion_04	= (RadioButton) findViewById(R.id.radio_13_opcion_04);
	


        radio_14 = (RadioGroup) findViewById(R.id.radio_14);
		radio_14_opcion_01	= (RadioButton) findViewById(R.id.radio_14_opcion_01);
		radio_14_opcion_02	= (RadioButton) findViewById(R.id.radio_14_opcion_02);
		radio_14_opcion_03	= (RadioButton) findViewById(R.id.radio_14_opcion_03);
		radio_14_opcion_04	= (RadioButton) findViewById(R.id.radio_14_opcion_04);
		

        radio_15 = (RadioGroup) findViewById(R.id.radio_15);
		radio_15_opcion_01	= (RadioButton) findViewById(R.id.radio_15_opcion_01);
		radio_15_opcion_02	= (RadioButton) findViewById(R.id.radio_15_opcion_02);
		radio_15_opcion_03	= (RadioButton) findViewById(R.id.radio_15_opcion_03);
		radio_15_opcion_04	= (RadioButton) findViewById(R.id.radio_15_opcion_04);
		


        radio_16 = (RadioGroup) findViewById(R.id.radio_16);
		radio_16_opcion_01	= (RadioButton) findViewById(R.id.radio_16_opcion_01);
		radio_16_opcion_02	= (RadioButton) findViewById(R.id.radio_16_opcion_02);
		radio_16_opcion_03	= (RadioButton) findViewById(R.id.radio_16_opcion_03);
		radio_16_opcion_04	= (RadioButton) findViewById(R.id.radio_16_opcion_04);
	


        radio_17 = (RadioGroup) findViewById(R.id.radio_17);
		radio_17_opcion_01	= (RadioButton) findViewById(R.id.radio_17_opcion_01);
		radio_17_opcion_02	= (RadioButton) findViewById(R.id.radio_17_opcion_02);
		radio_17_opcion_03	= (RadioButton) findViewById(R.id.radio_17_opcion_03);
		radio_17_opcion_04	= (RadioButton) findViewById(R.id.radio_17_opcion_04);
		


        radio_18 = (RadioGroup) findViewById(R.id.radio_18);
		radio_18_opcion_01	= (RadioButton) findViewById(R.id.radio_18_opcion_01);
		radio_18_opcion_02	= (RadioButton) findViewById(R.id.radio_18_opcion_02);
		radio_18_opcion_03	= (RadioButton) findViewById(R.id.radio_18_opcion_03);
		radio_18_opcion_04	= (RadioButton) findViewById(R.id.radio_18_opcion_04);
		


        radio_19 = (RadioGroup) findViewById(R.id.radio_19);
		radio_19_opcion_01	= (RadioButton) findViewById(R.id.radio_19_opcion_01);
		radio_19_opcion_02	= (RadioButton) findViewById(R.id.radio_19_opcion_02);
		radio_19_opcion_03	= (RadioButton) findViewById(R.id.radio_19_opcion_03);
		radio_19_opcion_04	= (RadioButton) findViewById(R.id.radio_19_opcion_04);
		
		seleccion_13_01 = radio_13_opcion_01.getId();
		seleccion_13_02 = radio_13_opcion_02.getId();
		seleccion_13_03 = radio_13_opcion_03.getId();
		seleccion_13_04 = radio_13_opcion_04.getId();
        
		seleccion_14_01 = radio_14_opcion_01.getId();
		seleccion_14_02 = radio_14_opcion_02.getId();
		seleccion_14_03 = radio_14_opcion_03.getId();
		seleccion_14_04 = radio_14_opcion_04.getId();
     
		seleccion_15_01 = radio_15_opcion_01.getId();
		seleccion_15_02 = radio_15_opcion_02.getId();
		seleccion_15_03 = radio_15_opcion_03.getId();
		seleccion_15_04 = radio_15_opcion_04.getId();
        
		seleccion_16_01 = radio_16_opcion_01.getId();
		seleccion_16_02 = radio_16_opcion_02.getId();
		seleccion_16_03 = radio_16_opcion_03.getId();
		seleccion_16_04 = radio_16_opcion_04.getId();
		
		seleccion_17_01 = radio_17_opcion_01.getId();
		seleccion_17_02 = radio_17_opcion_02.getId();
		seleccion_17_03 = radio_17_opcion_03.getId();
		seleccion_17_04 = radio_17_opcion_04.getId();
		
		seleccion_18_01 = radio_18_opcion_01.getId();
		seleccion_18_02 = radio_18_opcion_02.getId();
		seleccion_18_03 = radio_18_opcion_03.getId();
		seleccion_18_04 = radio_18_opcion_04.getId();
		
		seleccion_19_01 = radio_19_opcion_01.getId();
		seleccion_19_02 = radio_19_opcion_02.getId();
		seleccion_19_03 = radio_19_opcion_03.getId();
		seleccion_19_04 = radio_19_opcion_04.getId();
		
		btn_depresion_siguiente = (Button)findViewById(R.id.siguiente_depresion_button);
	    btn_depresion_abortar = (Button)findViewById(R.id.abortar_depresion_button);
		
        radio_13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_13 = me_das_tu_ora();
                 if(seleccion_13_01 == checkedId)
                 {
                 	seleccion_13 = 1;              	
                 }
                 if(seleccion_13_02 == checkedId)
                 {
                 	seleccion_13 = 2;
                 }
                 if(seleccion_13_03 == checkedId)
                 {
                 	seleccion_13 = 3;
                 }
                 if(seleccion_13_04 == checkedId)
                 {
                 	seleccion_13 = 4;
                 }
              
            }
        });

        radio_14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_14 = me_das_tu_ora();
                 if(seleccion_14_01 == checkedId)
                 {
                 	seleccion_14 = 1;              	
                 }
                 if(seleccion_14_02 == checkedId)
                 {
                 	seleccion_14 = 2;
                 }
                 if(seleccion_14_03 == checkedId)
                 {
                 	seleccion_14 = 3;
                 }
                 if(seleccion_14_04 == checkedId)
                 {
                 	seleccion_14 = 4;
                 }
            }
        });

        radio_15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {

                 tiempo_15 = me_das_tu_ora();
                 if(seleccion_15_01 == checkedId)
                 {
                 	seleccion_15 = 1;              	
                 }
                 if(seleccion_15_02 == checkedId)
                 {
                 	seleccion_15 = 2;
                 }
                 if(seleccion_15_03 == checkedId)
                 {
                 	seleccion_15 = 3;
                 }
                 if(seleccion_15_04 == checkedId)
                 {
                 	seleccion_15 = 4;
                 }    
            }
        });

        radio_16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_16 = me_das_tu_ora();
                 if(seleccion_16_01 == checkedId)
                 {
                 	seleccion_16 = 1;              	
                 }
                 if(seleccion_16_02 == checkedId)
                 {
                 	seleccion_16 = 2;
                 }
                 if(seleccion_16_03 == checkedId)
                 {
                 	seleccion_16 = 3;
                 }
                 if(seleccion_16_04 == checkedId)
                 {
                 	seleccion_16 = 4;
                 }

            }
        });

        radio_17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_17 = me_das_tu_ora();
                 if(seleccion_17_01 == checkedId)
                 {
                 	seleccion_17 = 1;              	
                 }
                 if(seleccion_17_02 == checkedId)
                 {
                 	seleccion_17 = 2;
                 }
                 if(seleccion_17_03 == checkedId)
                 {
                 	seleccion_17 = 3;
                 }
                 if(seleccion_17_04 == checkedId)
                 {
                 	seleccion_17 = 4;
                 }
            }
        });

        radio_18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_18 = me_das_tu_ora();
                 if(seleccion_18_01 == checkedId)
                 {
                 	seleccion_18 = 1;              	
                 }
                 if(seleccion_18_02 == checkedId)
                 {
                 	seleccion_18 = 2;
                 }
                 if(seleccion_18_03 == checkedId)
                 {
                 	seleccion_18 = 3;
                 }
                 if(seleccion_18_04 == checkedId)
                 {
                 	seleccion_18 = 4;
                 }
            }
        });

        radio_19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                 tiempo_19 = me_das_tu_ora();
                 if(seleccion_19_01 == checkedId)
                 {
                 	seleccion_19 = 1;              	
                 }
                 if(seleccion_19_02 == checkedId)
                 {
                 	seleccion_19 = 2;
                 }
                 if(seleccion_19_03 == checkedId)
                 {
                 	seleccion_19 = 3;
                 }
                 if(seleccion_19_04 == checkedId)
                 {
                 	seleccion_19 = 4;
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

        String comando_1 = "SELECT p_1301, " +
                "p_1401, p_1501, p_1601, p_1701, p_1801, " +
                "p_1901 " +
                "FROM cuestionariobasico " +
                "WHERE registro = " + "'" + el_registro + "'";

        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0104(comando_1);
        fuenteCuestionarioBasico.close();
        
        if((matriz[0] != null)&& (matriz[1] != null)&&(matriz[2] != null)&&(matriz[3] != null)&&
        		(matriz[4] != null)&& (matriz[5] != null)&& (matriz[6] != null)){
        Integer valor_1301 = Integer.valueOf(matriz[0].toString());
    	Integer valor_1401 = Integer.valueOf(matriz[1].toString());
    	Integer valor_1501 = Integer.valueOf(matriz[2].toString());
    	Integer valor_1601 = Integer.valueOf(matriz[3].toString());
    	Integer valor_1701 = Integer.valueOf(matriz[4].toString());
    	Integer valor_1801 = Integer.valueOf(matriz[5].toString());
    	Integer valor_1901 = Integer.valueOf(matriz[6].toString());
    	
    	if(valor_1301 > 0)
    	{
    		seleccion_13 = valor_1301;
    		
    		switch(valor_1301){
    		case 1:
    			radio_13_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_13_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_13_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_13_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1401 > 0)
    	{
    		seleccion_14 = valor_1401;
    		
    		switch(valor_1401){
    		case 1:
    			radio_14_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_14_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_14_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_14_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1501 > 0)
    	{
    		seleccion_15 = valor_1501;
    		
    		switch(valor_1501){
    		case 1:
    			radio_15_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_15_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_15_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_15_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1601 > 0)
    	{
    		seleccion_16 = valor_1601;
    		
    		switch(valor_1601){
    		case 1:
    			radio_16_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_16_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_16_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_16_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1701 > 0)
    	{
    		seleccion_17 = valor_1701;
    		
    		switch(valor_1701){
    		case 1:
    			radio_17_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_17_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_17_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_17_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1801 > 0)
    	{
    		seleccion_18 = valor_1801;
    		
    		switch(valor_1801){
    		case 1:
    			radio_18_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_18_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_18_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_18_opcion_04.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_1901 > 0)
    	{
    		seleccion_19 = valor_1901;
    		
    		switch(valor_1901){
    		case 1:
    			radio_19_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_19_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_19_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_19_opcion_04.setChecked(true);
    			break;
    		}
    	}
      }
   
        
        btn_depresion_siguiente.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				siguienteDepresion(view);
			}
		});
	    btn_depresion_abortar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				depresionAbortar(view);
			}
		});
        
	}
	
	  public void siguienteDepresion(View view){
	        Intent condepre = new Intent(this,CuestionarioBarthel.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();
	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01  = ", p_1301";
	        String comando_02 = ", t_1301";
	        String comando_03  = ", p_1401";
	        String comando_04 = ", t_1401";
	        String comando_05  = ", p_1501";
	        String comando_06 = ", t_1501";
	        String comando_07  = ", p_1601";
	        String comando_08 = ", t_1601";
	        String comando_09  = ", p_1701";
	        String comando_10 = ", t_1701";
	        String comando_11  = ", p_1801";
	        String comando_12 = ", t_1801";
	        String comando_13  = ", p_1901";
	        String comando_14 = ", t_1901";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
	                comando_01, seleccion_13,
	                comando_02, tiempo_13,
	                comando_03, seleccion_14,
	                comando_04, tiempo_14,
	                comando_05, seleccion_15,
	                comando_06, tiempo_15,
	                comando_07, seleccion_16,
	                comando_08, tiempo_16,
	                comando_09, seleccion_17,
	                comando_10, tiempo_17,
	                comando_11, seleccion_18,
	                comando_12, tiempo_18,
	                comando_13, seleccion_19,
	                comando_14, tiempo_19,
	                comando_50);
	        startActivity(condepre);
	    }
	  
	  public void depresionAbortar(View view)
	    {
	        Intent depreabortar = new Intent(getApplicationContext(),MainActivity.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();
	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01  = ", p_1301";
	        String comando_02 = ", t_1301";
	        String comando_03  = ", p_1401";
	        String comando_04 = ", t_1401";
	        String comando_05  = ", p_1501";
	        String comando_06 = ", t_1501";
	        String comando_07  = ", p_1601";
	        String comando_08 = ", t_1601";
	        String comando_09  = ", p_1701";
	        String comando_10 = ", t_1701";
	        String comando_11  = ", p_1801";
	        String comando_12 = ", t_1801";
	        String comando_13  = ", p_1901";
	        String comando_14 = ", t_1901";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
	                comando_01, seleccion_13,
	                comando_02, tiempo_13,
	                comando_03, seleccion_14,
	                comando_04, tiempo_14,
	                comando_05, seleccion_15,
	                comando_06, tiempo_15,
	                comando_07, seleccion_16,
	                comando_08, tiempo_16,
	                comando_09, seleccion_17,
	                comando_10, tiempo_17,
	                comando_11, seleccion_18,
	                comando_12, tiempo_18,
	                comando_13, seleccion_19,
	                comando_14, tiempo_19,
	                comando_50);
	        depreabortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        depreabortar.putExtra("EXIT",true);
	        startActivity(depreabortar);
	    }
	
	 public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }
}