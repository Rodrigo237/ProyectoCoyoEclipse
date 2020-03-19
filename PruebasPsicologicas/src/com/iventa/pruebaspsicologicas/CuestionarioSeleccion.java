package com.iventa.pruebaspsicologicas;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologicas.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint({ "SimpleDateFormat", "Registered" })
public class CuestionarioSeleccion extends Activity{
	
	Button btn_siguiente_seleccion;
	Button btn_abortar_seleccion;
	private String seleccion_fecha;
    private String seleccion_hora_ini;
    private String seleccion_fechor_ini;


    FuenteCuestionarioBasico fuenteCuestionarioBasico;
	private RadioGroup radio_01;
	private RadioButton radio_01_opcion_01;	// nunca1
	private RadioButton radio_01_opcion_02;	// muy1
	private RadioButton radio_01_opcion_03;	// algunas1
	private RadioButton radio_01_opcion_04;	// casisiempre1
	private RadioButton radio_01_opcion_05;	// siempre1
	private int seleccion_01 = 0; // Dejar aqu� el valor de una de las 5 opciones.
	private int seleccion_01_01 = 0; // Valor de la opci�n 01.
	private int seleccion_01_02 = 0; // Valor de la opci�n 02.
	private int seleccion_01_03 = 0; // Valor de la opci�n 03.
	private int seleccion_01_04 = 0; // Valor de la opci�n 04.
	private int seleccion_01_05 = 0; // Valor de la opci�n 05.
	private String tiempo_01;
	
	private RadioGroup radio_02;
	private RadioButton radio_02_opcion_01;
	private RadioButton radio_02_opcion_02;
	private RadioButton radio_02_opcion_03;
	private RadioButton radio_02_opcion_04;
	private RadioButton radio_02_opcion_05;
	private int seleccion_02 = 0;
	private int seleccion_02_01 = 0;
	private int seleccion_02_02 = 0;
	private int seleccion_02_03 = 0;
	private int seleccion_02_04 = 0;
	private int seleccion_02_05 = 0;
	private String tiempo_02;
	
	private RadioGroup radio_03;
	private RadioButton radio_03_opcion_01;
	private RadioButton radio_03_opcion_02;
	private RadioButton radio_03_opcion_03;
	private RadioButton radio_03_opcion_04;
	private RadioButton radio_03_opcion_05;
	private int seleccion_03 = 0;
	private int seleccion_03_01 = 0;
	private int seleccion_03_02 = 0;
	private int seleccion_03_03 = 0;
	private int seleccion_03_04 = 0;
	private int seleccion_03_05 = 0;
	private String tiempo_03;

	private RadioGroup radio_04;
	private RadioButton radio_04_opcion_01;
	private RadioButton radio_04_opcion_02;
	private RadioButton radio_04_opcion_03;
	private RadioButton radio_04_opcion_04;
	private RadioButton radio_04_opcion_05;
	private int seleccion_04 = 0;
	private int seleccion_04_01 = 0;
	private int seleccion_04_02 = 0;
	private int seleccion_04_03 = 0;
	private int seleccion_04_04 = 0;
	private int seleccion_04_05 = 0;
	private String tiempo_04;

	private RadioGroup radio_05;
	private RadioButton radio_05_opcion_01;
	private RadioButton radio_05_opcion_02;
	private RadioButton radio_05_opcion_03;
	private RadioButton radio_05_opcion_04;
	private RadioButton radio_05_opcion_05;
	private int seleccion_05 = 0;
	private int seleccion_05_01 = 0;
	private int seleccion_05_02 = 0;
	private int seleccion_05_03 = 0;
	private int seleccion_05_04 = 0;
	private int seleccion_05_05 = 0;
	private String tiempo_05;

	private RadioGroup radio_06;
	private RadioButton radio_06_opcion_01;
	private RadioButton radio_06_opcion_02;
	private RadioButton radio_06_opcion_03;
	private RadioButton radio_06_opcion_04;
	private RadioButton radio_06_opcion_05;
	private int seleccion_06 = 0;
	private int seleccion_06_01 = 0;
	private int seleccion_06_02 = 0;
	private int seleccion_06_03 = 0;
	private int seleccion_06_04 = 0;
	private int seleccion_06_05 = 0;
	private String tiempo_06;

	private RadioGroup radio_07;
	private RadioButton radio_07_opcion_01;
	private RadioButton radio_07_opcion_02;
	private RadioButton radio_07_opcion_03;
	private RadioButton radio_07_opcion_04;
	private RadioButton radio_07_opcion_05;
	private int seleccion_07 = 0;
	private int seleccion_07_01 = 0;
	private int seleccion_07_02 = 0;
	private int seleccion_07_03 = 0;
	private int seleccion_07_04 = 0;
	private int seleccion_07_05 = 0;
	private String tiempo_07;

	private RadioGroup radio_08;
	private RadioButton radio_08_opcion_01;
	private RadioButton radio_08_opcion_02;
	private RadioButton radio_08_opcion_03;
	private RadioButton radio_08_opcion_04;
	private RadioButton radio_08_opcion_05;
	private int seleccion_08 = 0;
	private int seleccion_08_01 = 0;
	private int seleccion_08_02 = 0;
	private int seleccion_08_03 = 0;
	private int seleccion_08_04 = 0;
	private int seleccion_08_05 = 0;
	private String tiempo_08;

	private RadioGroup radio_09;
	private RadioButton radio_09_opcion_01;
	private RadioButton radio_09_opcion_02;
	private RadioButton radio_09_opcion_03;
	private RadioButton radio_09_opcion_04;
	private RadioButton radio_09_opcion_05;
	private int seleccion_09 = 0;
	private int seleccion_09_01 = 0;
	private int seleccion_09_02 = 0;
	private int seleccion_09_03 = 0;
	private int seleccion_09_04 = 0;
	private int seleccion_09_05 = 0;
	private String tiempo_09;

    
    private static String la_tableta;
    private static String el_encuesto;
    private String el_registro;
    private  String la_cadena;
    private String la_fecha;
    private String hora_inicio;
    private String fecha_inicio;
    
    private Button btn_siguiente;
    private Button btn_abortar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_seleccion);
		
		Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

        radio_01			= (RadioGroup) findViewById(R.id.radio_01);
		radio_01_opcion_01	= (RadioButton) findViewById(R.id.radio_01_opcion_01);
		radio_01_opcion_02	= (RadioButton) findViewById(R.id.radio_01_opcion_02);
		radio_01_opcion_03	= (RadioButton) findViewById(R.id.radio_01_opcion_03);
		radio_01_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_01_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
        radio_02			= (RadioGroup) findViewById(R.id.radio_02);
		radio_02_opcion_01	= (RadioButton) findViewById(R.id.radio_02_opcion_01);
		radio_02_opcion_02	= (RadioButton) findViewById(R.id.radio_02_opcion_02);
		radio_02_opcion_03	= (RadioButton) findViewById(R.id.radio_02_opcion_03);
		radio_02_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_02_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
		radio_03			= (RadioGroup) findViewById(R.id.radio_03);
		radio_03_opcion_01	= (RadioButton) findViewById(R.id.radio_03_opcion_01);
		radio_03_opcion_02	= (RadioButton) findViewById(R.id.radio_03_opcion_02);
		radio_03_opcion_03	= (RadioButton) findViewById(R.id.radio_03_opcion_03);
		radio_03_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_03_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
		radio_04			= (RadioGroup) findViewById(R.id.radio_04);
		radio_04_opcion_01	= (RadioButton) findViewById(R.id.radio_04_opcion_01);
		radio_04_opcion_02	= (RadioButton) findViewById(R.id.radio_04_opcion_02);
		radio_04_opcion_03	= (RadioButton) findViewById(R.id.radio_04_opcion_03);
        radio_05			= (RadioGroup) findViewById(R.id.radio_05);
		radio_05_opcion_01	= (RadioButton) findViewById(R.id.radio_05_opcion_01);
		radio_05_opcion_02	= (RadioButton) findViewById(R.id.radio_05_opcion_02);
		radio_05_opcion_03	= (RadioButton) findViewById(R.id.radio_05_opcion_03);
		radio_05_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_05_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
		radio_06			= (RadioGroup) findViewById(R.id.radio_06);
		radio_06_opcion_01	= (RadioButton) findViewById(R.id.radio_06_opcion_01);
		radio_06_opcion_02	= (RadioButton) findViewById(R.id.radio_06_opcion_02);
		radio_06_opcion_03	= (RadioButton) findViewById(R.id.radio_06_opcion_03);
		radio_06_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_06_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
        radio_07			= (RadioGroup) findViewById(R.id.radio_07);
		radio_07_opcion_01	= (RadioButton) findViewById(R.id.radio_07_opcion_01);
		radio_07_opcion_02	= (RadioButton) findViewById(R.id.radio_07_opcion_02);
		radio_07_opcion_03	= (RadioButton) findViewById(R.id.radio_07_opcion_03);
		radio_07_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_07_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
		radio_08			= (RadioGroup) findViewById(R.id.radio_08);
		radio_08_opcion_01	= (RadioButton) findViewById(R.id.radio_08_opcion_01);
		radio_08_opcion_02	= (RadioButton) findViewById(R.id.radio_08_opcion_02);
		radio_08_opcion_03	= (RadioButton) findViewById(R.id.radio_08_opcion_03);
		radio_08_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_08_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
		radio_09			= (RadioGroup) findViewById(R.id.radio_09);
		radio_09_opcion_01	= (RadioButton) findViewById(R.id.radio_09_opcion_01);
		radio_09_opcion_02	= (RadioButton) findViewById(R.id.radio_09_opcion_02);
		radio_09_opcion_03	= (RadioButton) findViewById(R.id.radio_09_opcion_03);
		radio_09_opcion_04	= (RadioButton) findViewById(R.id.radio_01_opcion_04);
		radio_09_opcion_05	= (RadioButton) findViewById(R.id.radio_01_opcion_05);
        
		btn_siguiente = (Button)findViewById(R.id.siguiente_select_button);
		btn_abortar = (Button)findViewById(R.id.siguiente_abortar_select_button);
		seleccion_01_01 = radio_01_opcion_01.getId();
		seleccion_01_02 = radio_01_opcion_02.getId();
		seleccion_01_03 = radio_01_opcion_03.getId();
		seleccion_01_04 = radio_01_opcion_04.getId();
		seleccion_01_05 = radio_01_opcion_05.getId();
		seleccion_02_01 = radio_02_opcion_01.getId();
		seleccion_02_02 = radio_02_opcion_02.getId();
		seleccion_02_03 = radio_02_opcion_03.getId();
		seleccion_02_04 = radio_02_opcion_04.getId();
		seleccion_02_05 = radio_02_opcion_05.getId();
		seleccion_03_01 = radio_03_opcion_01.getId();
		seleccion_03_02 = radio_03_opcion_02.getId();
		seleccion_03_03 = radio_03_opcion_03.getId();
		seleccion_03_04 = radio_03_opcion_04.getId();
		seleccion_03_05 = radio_03_opcion_05.getId();
		seleccion_04_01 = radio_04_opcion_01.getId();
		seleccion_04_02 = radio_04_opcion_02.getId();
		seleccion_04_03 = radio_04_opcion_03.getId();
		seleccion_04_04 = radio_04_opcion_04.getId();
		seleccion_04_05 = radio_04_opcion_05.getId();
		seleccion_05_01 = radio_05_opcion_01.getId();
		seleccion_05_02 = radio_05_opcion_02.getId();
		seleccion_05_03 = radio_05_opcion_03.getId();
		seleccion_05_04 = radio_05_opcion_04.getId();
		seleccion_05_05 = radio_05_opcion_05.getId();
		seleccion_06_01 = radio_06_opcion_01.getId();
		seleccion_06_02 = radio_06_opcion_02.getId();
		seleccion_06_03 = radio_06_opcion_03.getId();
		seleccion_06_04 = radio_06_opcion_04.getId();
		seleccion_06_05 = radio_06_opcion_05.getId();
		seleccion_07_01 = radio_07_opcion_01.getId();
		seleccion_07_02 = radio_07_opcion_02.getId();
		seleccion_07_03 = radio_07_opcion_03.getId();
		seleccion_07_04 = radio_07_opcion_04.getId();
		seleccion_07_05 = radio_07_opcion_05.getId();
		seleccion_08_01 = radio_08_opcion_01.getId();
		seleccion_08_02 = radio_08_opcion_02.getId();
		seleccion_08_03 = radio_08_opcion_03.getId();
		seleccion_08_04 = radio_08_opcion_04.getId();
		seleccion_08_05 = radio_08_opcion_05.getId();
		seleccion_09_01 = radio_01_opcion_01.getId();
		seleccion_09_02 = radio_02_opcion_02.getId();
		seleccion_09_03 = radio_03_opcion_03.getId();
		seleccion_09_04 = radio_04_opcion_04.getId();
		seleccion_09_05 = radio_05_opcion_05.getId();
		
        
        radio_01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                
                tiempo_01 = me_das_tu_ora();
                if(seleccion_01_01 == checkedId)
                {
                	seleccion_01 = 1;              	
                }
                if(seleccion_01_02 == checkedId)
                {
                	seleccion_01 = 2;
                }
                if(seleccion_01_03 == checkedId)
                {
                	seleccion_01 = 3;
                }
                if(seleccion_01_04 == checkedId)
                {
                	seleccion_01 = 4;
                }
                if(seleccion_01_05 == checkedId)
                {
                	seleccion_01 = 5;
                }
            }
        });
        
        radio_02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_02 = me_das_tu_ora();
                if(seleccion_02_01 == checkedId)
                {
                	seleccion_02 = 1;              	
                }
                if(seleccion_02_02 == checkedId)
                {
                	seleccion_02 = 2;
                }
                if(seleccion_02_03 == checkedId)
                {
                	seleccion_02 = 3;
                }
                if(seleccion_02_04 == checkedId)
                {
                	seleccion_02 = 4;
                }
                if(seleccion_02_05 == checkedId)
                {
                	seleccion_02 = 5;
                }
            }
        });

        radio_03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_03 = me_das_tu_ora();
                if(seleccion_03_01 == checkedId)
                {
                	seleccion_03 = 1;              	
                }
                if(seleccion_03_02 == checkedId)
                {
                	seleccion_03 = 2;
                }
                if(seleccion_03_03 == checkedId)
                {
                	seleccion_03 = 3;
                }
                if(seleccion_03_04 == checkedId)
                {
                	seleccion_03 = 4;
                }
                if(seleccion_03_05 == checkedId)
                {
                	seleccion_03 = 5;
                }
            }
        });

        radio_04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_04 = me_das_tu_ora();
                if(seleccion_04_01 == checkedId)
                {
                	seleccion_04 = 1;              	
                }
                if(seleccion_04_02 == checkedId)
                {
                	seleccion_04 = 2;
                }
                if(seleccion_04_03 == checkedId)
                {
                	seleccion_04 = 3;
                }
                if(seleccion_04_04 == checkedId)
                {
                	seleccion_04 = 4;
                }
                if(seleccion_04_05 == checkedId)
                {
                	seleccion_04 = 5;
                }
            }
        });

        radio_05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_05 = me_das_tu_ora();
                if(seleccion_05_01 == checkedId)
                {
                	seleccion_05 = 1;              	
                }
                if(seleccion_05_02 == checkedId)
                {
                	seleccion_05 = 2;
                }
                if(seleccion_05_03 == checkedId)
                {
                	seleccion_05 = 3;
                }
                if(seleccion_05_04 == checkedId)
                {
                	seleccion_05 = 4;
                }
                if(seleccion_05_05 == checkedId)
                {
                	seleccion_05 = 5;
                }
            }
        });

        radio_06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_06 = me_das_tu_ora();
                if(seleccion_06_01 == checkedId)
                {
                	seleccion_06 = 1;              	
                }
                if(seleccion_06_02 == checkedId)
                {
                	seleccion_06 = 2;
                }
                if(seleccion_06_03 == checkedId)
                {
                	seleccion_06 = 3;
                }
                if(seleccion_06_04 == checkedId)
                {
                	seleccion_06 = 4;
                }
                if(seleccion_06_05 == checkedId)
                {
                	seleccion_06 = 5;
                }
            }
        });

        radio_07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_07 = me_das_tu_ora();
                if(seleccion_07_01 == checkedId)
                {
                	seleccion_07 = 1;              	
                }
                if(seleccion_07_02 == checkedId)
                {
                	seleccion_07 = 2;
                }
                if(seleccion_07_03 == checkedId)
                {
                	seleccion_07 = 3;
                }
                if(seleccion_07_04 == checkedId)
                {
                	seleccion_07 = 4;
                }
                if(seleccion_07_05 == checkedId)
                {
                	seleccion_07 = 5;
                }
            }
        });

        radio_08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_08 = me_das_tu_ora();
                if(seleccion_08_01 == checkedId)
                {
                	seleccion_08 = 1;              	
                }
                if(seleccion_08_02 == checkedId)
                {
                	seleccion_08 = 2;
                }
                if(seleccion_08_03 == checkedId)
                {
                	seleccion_08 = 3;
                }
                if(seleccion_08_04 == checkedId)
                {
                	seleccion_08 = 4;
                }
                if(seleccion_08_05 == checkedId)
                {
                	seleccion_08 = 5;
                }
            }

        });

        radio_09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           
            public void onCheckedChanged (RadioGroup group, int checkedId) {
            	tiempo_09 = me_das_tu_ora();
                if(seleccion_09_01 == checkedId)
                {
                	seleccion_09 = 1;              	
                }
                if(seleccion_09_02 == checkedId)
                {
                	seleccion_09 = 2;
                }
                if(seleccion_09_03 == checkedId)
                {
                	seleccion_09 = 3;
                }
                if(seleccion_09_04 == checkedId)
                {
                	seleccion_09 = 4;
                }
                if(seleccion_09_05 == checkedId)
                {
                	seleccion_09 = 5;
                }
            }
        });


	fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
    fuenteCuestionarioBasico.open();
    String comando_00 = "SELECT registro, tableta, encuesto FROM posicionador";
    String el_registro_leido[] = fuenteCuestionarioBasico.tomarEncuesto(comando_00);
    if (el_registro_leido[0] != null) el_registro = String.valueOf(el_registro_leido[0].toString());
    if (el_registro_leido[1] != null) la_tableta = String.valueOf(el_registro_leido[1].toString());
    if (el_registro_leido[2] != null) el_encuesto = String.valueOf(el_registro_leido[2].toString());
    
    
    String comando_0 = "SELECT nombre, paterno, materno FROM cuestionariobasico WHERE registro = " + "'" + el_registro + "'";
    String identificacion[] = fuenteCuestionarioBasico.tomarNombre(comando_0);

    if ((identificacion[0] != null) && (identificacion[1] != null )) {
        String el_nombre = String.valueOf(identificacion[0].toString());
        String el_paterno = String.valueOf(identificacion[1].toString());
        String el_materno = String.valueOf(identificacion[2].toString());

        if ((el_nombre.length() > 0) && (el_paterno.length() > 0) && (el_materno.length() > 0)) {
          //  exhibe_nombre.setText("Registro de:" + el_nombre.trim() + " " + el_paterno.trim() + " " + el_materno.trim());
        
        	
        	
    }

    String comando_1 = "SELECT p_0101, " +
            " p_0201,p_0301,p_0401,p_0501,p_0601,p_0701,p_0801,p_0901 " +
            "FROM cuestionariobasico " +
            "WHERE registro = " + "'" + el_registro + "'";

    final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0101(comando_1);
    fuenteCuestionarioBasico.close();
        
    if((matriz[0] != null) && (matriz[1] != null) &&  (matriz[2] != null) &&  (matriz[3] != null) &&
    		 (matriz[4] != null) &&  (matriz[5] != null) &&  (matriz[6] != null) &&  (matriz[7] != null) &&
    		 (matriz[8] != null))
    {
    	Integer valor_0101 = Integer.valueOf(matriz[0].toString());
    	Integer valor_0201 = Integer.valueOf(matriz[1].toString());
    	Integer valor_0301 = Integer.valueOf(matriz[2].toString());
    	Integer valor_0401 = Integer.valueOf(matriz[3].toString());
    	Integer valor_0501 = Integer.valueOf(matriz[4].toString());
    	Integer valor_0601 = Integer.valueOf(matriz[5].toString());
    	Integer valor_0701 = Integer.valueOf(matriz[6].toString());
    	Integer valor_0801 = Integer.valueOf(matriz[7].toString());
    	Integer valor_0901 = Integer.valueOf(matriz[8].toString());
    	
    	if(valor_0101 > 0)
    	{
    		seleccion_01 = valor_0101;
    		
    		switch(valor_0101){
    		case 1:
    			radio_01_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_01_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_01_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_01_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_01_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0201 > 0)
    	{
    		seleccion_02 = valor_0201;

    		switch(valor_0101){
    		case 1:
    			radio_01_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_01_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_01_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_01_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_01_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0301 > 0)
    	{
    		seleccion_03 = valor_0301;

    		switch(valor_0301){
    		case 1:
    			radio_03_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_03_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_03_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_03_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_03_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0401 > 0)
    	{
    		seleccion_04 = valor_0401;

    		switch(valor_0401){
    		case 1:
    			radio_04_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_04_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_04_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_04_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_04_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0501 > 0)
    	{
    		seleccion_05 = valor_0201;

    		switch(valor_0501){
    		case 1:
    			radio_05_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_05_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_05_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_05_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_05_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0601 > 0)
    	{
    		seleccion_06 = valor_0601;

    		switch(valor_0601){
    		case 1:
    			radio_06_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_06_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_06_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_06_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_06_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0701 > 0)
    	{
    		seleccion_07 = valor_0701;

    		switch(valor_0701){
    		case 1:
    			radio_07_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_07_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_07_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_07_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_07_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	if(valor_0801 > 0)
    	{
    		seleccion_08 = valor_0801;

    		switch(valor_0801){
    		case 1:
    			radio_08_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_08_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_08_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_08_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_08_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	
    	if(valor_0901 > 0)
    	{
    		seleccion_09 = valor_0901;

    		switch(valor_0101){
    		case 1:
    			radio_09_opcion_01.setChecked(true);
    			break;
    		case 2:
    			radio_09_opcion_02.setChecked(true);
    			break;
    		case 3:
    			radio_09_opcion_03.setChecked(true);
    			break;
    		case 4:
    			radio_09_opcion_04.setChecked(true);
    			break;
    		case 5:
    			radio_09_opcion_05.setChecked(true);
    			break;
    		}
    	}
    	
    }
}
    btn_siguiente.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View view) {
			// TODO Auto-generated method stub
			Siguienteseleccion(view);
		}
	});
    
    btn_abortar.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View view) {
			// TODO Auto-generated method stub
			abortarSeleccion(view);
		}
	});
    
}
	
	public void Siguienteseleccion(View view){
        Intent selint = new Intent(this,CuestionarioSeleccionSegundo.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = " fecha";
        String comando_02 = " , hora_ini";
        String comando_03 = ", fechor_ini";
        String comando_04 = " , p_0101 = ";
        String comando_05 = ", t_0101 = ";
        String comando_06 = ", p_0201 = ";
        String comando_07 = ", t_0201 = ";
        String comando_08 = ", p_0301 = ";
        String comando_09 = ", t_0301 = ";
        String comando_10 = ", p_0401 = ";
        String comando_11 = ", t_0401 = ";
        String comando_12 = ", p_0501 = ";
        String comando_13 = ", t_0501 = ";
        String comando_14 = ", p_0601 = ";
        String comando_15 = ", t_0601 = ";
        String comando_16 = ", p_0701 = ";
        String comando_17 = ", t_0701 = ";
        String comando_18 = ", p_0801 = ";
        String comando_19 = ", t_0801 = ";
        String comando_20 = ", p_0901 = ";
        String comando_21 = ", t_0901= ";
        String comando_28 = ", encuesto = ";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0101(comando_00,
                 comando_01, seleccion_fecha,
                 comando_02, seleccion_hora_ini,
                 comando_03, seleccion_fechor_ini,
        		 comando_04,  seleccion_01,
                 comando_05,  tiempo_01,
                 comando_06,  seleccion_02,
                 comando_07,  tiempo_02,
                 comando_08,  seleccion_03,
                 comando_09, tiempo_03,
                 comando_10, seleccion_04,
                 comando_11,  tiempo_04,
                 comando_12, seleccion_05,
                 comando_13, tiempo_05,
                 comando_14, seleccion_06,
                 comando_15,  tiempo_06,
                 comando_16, seleccion_07,
                 comando_17,  tiempo_07,
                 comando_18, seleccion_08,
                 comando_19,  tiempo_08,
                 comando_20, seleccion_09,
                 comando_21,  tiempo_09,
                 comando_28, "'" + el_encuesto + "'",
                 comando_50);
        startActivity(selint);
	}
	
	 public void abortarSeleccion(View view)
	    {
	        Intent abortarSelec = new Intent(getApplicationContext(),MainActivity.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();

	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01 = " fecha";
	        String comando_02 = " , hora_ini";
	        String comando_03 = ", fechor_ini";
	        String comando_04 = " , p_0101 = ";
	        String comando_05 = ", t_0101 = ";
	        String comando_06 = ", p_0201 = ";
	        String comando_07 = ", t_0201 = ";
	        String comando_08 = ", p_0301 = ";
	        String comando_09 = ", t_0301 = ";
	        String comando_10 = ", p_0401 = ";
	        String comando_11 = ", t_0401 = ";
	        String comando_12 = ", p_0501 = ";
	        String comando_13 = ", t_0501 = ";
	        String comando_14 = ", p_0601 = ";
	        String comando_15 = ", t_0601 = ";
	        String comando_16 = ", p_0701 = ";
	        String comando_17 = ", t_0701 = ";
	        String comando_18 = ", p_0801 = ";
	        String comando_19 = ", t_0801 = ";
	        String comando_20 = ", p_0901 = ";
	        String comando_21 = ", t_0901= ";
	        String comando_28 = ", encuesto = ";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0101(comando_00,
	                comando_01,  seleccion_fecha,
	                comando_02,  seleccion_hora_ini,
	                comando_03,  seleccion_fechor_ini,
	                comando_04,  seleccion_01,
	                comando_05,  tiempo_01,
	                comando_06, seleccion_02,
	                comando_07, tiempo_02,
	                comando_08,  seleccion_03,
	                comando_09, tiempo_03,
	                comando_10, seleccion_04,
	                comando_11, tiempo_04,
	                comando_12,  seleccion_05,
	                comando_13, tiempo_05,
	                comando_14,  seleccion_06,
	                comando_15, tiempo_06,
	                comando_16,  seleccion_07,
	                comando_17, tiempo_07,
	                comando_18,  seleccion_08,
	                comando_19, tiempo_08,
	                comando_20,  seleccion_09,
	                comando_21, tiempo_09,
	                comando_28, "'" + el_encuesto + "'",
	                comando_50);
	        abortarSelec.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        abortarSelec.putExtra("EXIT",true);
	        startActivity(abortarSelec);
	    }
	
	 public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }

}
