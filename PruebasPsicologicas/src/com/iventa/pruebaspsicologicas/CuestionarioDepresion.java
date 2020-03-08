package com.iventa.pruebaspsicologicas;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint("SimpleDateFormat")
public class CuestionarioDepresion extends Activity{
	
	 RadioButton rara13,pocas13,considerable13,todo13;
	    RadioButton rara14,pocas14,considerable14,todo14;
	    RadioButton rara15,pocas15,considerable15,todo15;
	    RadioButton rara16,pocas16,considerable16,todo16;
	    RadioButton rara17,pocas17,considerable17,todo17;
	    RadioButton rara18,pocas18,considerable18,todo18;
	    RadioButton rara19,pocas19,considerable19,todo19;
	    
	    FuenteCuestionarioBasico fuenteCuestionarioBasico;
	    RadioGroup radioGroupP13,radioGroupP14,radioGroupP15,radioGroupP16,radioGroupP17;
	    RadioGroup radioGroupP18,radioGroupP19;
	    
	    private static String la_tableta;
	    private static String el_encuesto;
	    private String el_registro;
	    private String seleccion_fecha;
	    private String seleccion_hora_ini;
	    private String seleccion_fechor_ini;
	    private  String la_cadena;
	    private String el_municipio;
	    private String el_ageb;
	    private String la_area;
	    private String la_manzana;
	    private String la_vivienda;
	    private String el_nombre;
	    private String el_paterno;
	    private String el_materno;
	    private String el_sexo;
	    private String la_edad;
	    private String la_edad_hoy;
	    private int seleccion_01;
	    private String tiempo_01;
	    private int seleccion_02;
	    private String tiempo_02;
	    private int seleccion_03;
	    private String tiempo_03;
	    private int seleccion_04;
	    private String tiempo_04;
	    private int seleccion_05;
	    private String tiempo_05;
	    private int seleccion_06;
	    private String tiempo_06;
	    private int seleccion_07;
	    private String tiempo_07;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_depresion);
		

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

        radioGroupP13 = (RadioGroup)findViewById(R.id.radioGroupPregunta13);
        radioGroupP14 = (RadioGroup)findViewById(R.id.RadioGroupPregunta14);
        radioGroupP15 = (RadioGroup)findViewById(R.id.RadioGroupPregunta15);
        radioGroupP16 = (RadioGroup)findViewById(R.id.RadioGroupPregunta16);
        radioGroupP17 = (RadioGroup)findViewById(R.id.RadioGroupPregunta17);
        radioGroupP18 = (RadioGroup)findViewById(R.id.RadioGroupPregunta18);
        radioGroupP19 = (RadioGroup)findViewById(R.id.RadioGroupPregunta19);
	

        rara13 = (RadioButton)findViewById(R.id.rara13);
        pocas13 = (RadioButton)findViewById(R.id.pocas13);
        considerable13 = (RadioButton)findViewById(R.id.considerable13);
        todo13 = (RadioButton)findViewById(R.id.todo13);

        rara14 = (RadioButton)findViewById(R.id.rara14);
        pocas14 = (RadioButton)findViewById(R.id.pocas14);
        considerable14 = (RadioButton)findViewById(R.id.considerable14);
        todo14 = (RadioButton)findViewById(R.id.todo14);

        rara15 = (RadioButton)findViewById(R.id.rara15);
        pocas15 = (RadioButton)findViewById(R.id.pocas15);
        considerable15 = (RadioButton)findViewById(R.id.considerable15);
        todo15 = (RadioButton)findViewById(R.id.todo15);

        rara16 = (RadioButton)findViewById(R.id.rara16);
        pocas16 = (RadioButton)findViewById(R.id.pocas16);
        considerable16 = (RadioButton)findViewById(R.id.considerable16);
        todo16 = (RadioButton)findViewById(R.id.todo16);


        rara17 = (RadioButton)findViewById(R.id.rara17);
        pocas17 = (RadioButton)findViewById(R.id.pocas17);
        considerable17 = (RadioButton)findViewById(R.id.considerable17);
        todo17 = (RadioButton)findViewById(R.id.todo17);

        rara17 = (RadioButton)findViewById(R.id.rara17);
        pocas17 = (RadioButton)findViewById(R.id.pocas17);
        considerable17 = (RadioButton)findViewById(R.id.considerable17);
        todo17 = (RadioButton)findViewById(R.id.todo17);

        rara18 = (RadioButton)findViewById(R.id.rara18);
        pocas18 = (RadioButton)findViewById(R.id.pocas18);
        considerable18 = (RadioButton)findViewById(R.id.considerable18);
        todo18 = (RadioButton)findViewById(R.id.todo18);
        
        rara19 = (RadioButton)findViewById(R.id.rara19);
        pocas19 = (RadioButton)findViewById(R.id.pocas19);
        considerable19 = (RadioButton)findViewById(R.id.considerable19);
        todo19 = (RadioButton)findViewById(R.id.todo19);
        
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

        String comando_1 = "SELECT registro, " +
                "municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, " +
                "sexo, edad, edad_hoy, " +
                "encuesto " +
                "FROM cuestionariobasico " +
                "WHERE registro = " + "'" + el_registro + "'";

        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0104(comando_1);
        el_registro =				matriz[0].toString();
        el_municipio =              matriz[1].toString();
        el_ageb	=           		matriz[2].toString();
        la_area =       			matriz[3].toString();
        la_manzana =		        matriz[4].toString();
        la_vivienda =       		matriz[5].toString();
        el_nombre =         		matriz[6].toString();
        el_paterno =        		matriz[7].toString();
        el_materno =        		matriz[8].toString();
        el_sexo =       			matriz[9].toString();
        la_edad   =             	matriz[10].toString();
        la_edad_hoy =           	matriz[11].toString();
        
        radioGroupP13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara13:
                        matriz[12] = "1";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 1;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.pocas13:
                        matriz[12] = "2";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 2;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.considerable13:
                        matriz[12] = "3";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 3;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.todo13:
                        matriz[12] = "4";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 4;
                        tiempo_01 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara14:
                        matriz[14] = "1";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 1;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.pocas14:
                        matriz[14] = "2";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 2;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.considerable14:
                        matriz[14] = "3";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 3;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.todo14:
                        matriz[14] = "4";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 4;
                        tiempo_02 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara15:
                        matriz[16] = "1";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 1;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.pocas15:
                        matriz[16] = "2";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 2;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.considerable15:
                        matriz[16] = "3";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 3;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.todo15:
                        matriz[16] = "4";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 4;
                        tiempo_03 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara16:
                        matriz[18] = "1";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 1;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.pocas16:
                        matriz[18] = "2";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 2;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.considerable16:
                        matriz[18] = "3";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 3;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.todo16:
                        matriz[18] = "4";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 4;
                        tiempo_04 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara17:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 1;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.pocas17:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 2;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.considerable17:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 3;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.todo17:
                        matriz[20] = "4";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 4;
                        tiempo_05 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara18:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 1;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.pocas18:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 2;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.considerable18:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 3;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.todo18:
                        matriz[20] = "4";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 4;
                        tiempo_06 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara19:
                        matriz[22] = "1";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 1;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.pocas19:
                        matriz[22] = "2";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 2;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.considerable19:
                        matriz[22] = "3";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 3;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.todo19:
                        matriz[22] = "4";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 4;
                        tiempo_07 = me_das_tu_ora();
                        break;
                }
            }
        });
	
	}
	
	  public void siguienteDepresion(View view){
	        Intent condepre = new Intent(this,CuestionarioBarthel.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();
	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01  = ", pdep_01";
	        String comando_02 = ", tpdep_01";
	        String comando_03  = ", pdep_02";
	        String comando_04 = ", tpdep_02";
	        String comando_05  = ", pdep_03";
	        String comando_06 = ", tpdep_03";
	        String comando_07  = ", pdep_04";
	        String comando_08 = ", tpdep_04";
	        String comando_09  = ", pdep_05";
	        String comando_10 = ", tpdep_05";
	        String comando_11  = ", pdep_06";
	        String comando_12 = ", tpdep_06";
	        String comando_13  = ", pdep_07";
	        String comando_14 = ", tpdep_07";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
	                comando_01, seleccion_01,
	                comando_02, tiempo_01,
	                comando_03, seleccion_02,
	                comando_04, tiempo_02,
	                comando_05, seleccion_03,
	                comando_06, tiempo_03,
	                comando_07, seleccion_04,
	                comando_08, tiempo_04,
	                comando_09, seleccion_05,
	                comando_10, tiempo_05,
	                comando_11, seleccion_06,
	                comando_12, tiempo_06,
	                comando_13, seleccion_07,
	                comando_14, tiempo_07,
	                comando_50);
	        startActivity(condepre);
	    }
	  
	  public void depresionAbortar(View view)
	    {
	        Intent depreabortar = new Intent(getApplicationContext(),MainActivity.class);
	        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
	        fuenteCuestionarioBasico.open();
	        String comando_00 = "UPDATE cuestionariobasico SET";
	        String comando_01  = ", pdep_01";
	        String comando_02 = ", tpdep_01";
	        String comando_03  = ", pdep_02";
	        String comando_04 = ", tpdep_02";
	        String comando_05  = ", pdep_03";
	        String comando_06 = ", tpdep_03";
	        String comando_07  = ", pdep_04";
	        String comando_08 = ", tpdep_04";
	        String comando_09  = ", pdep_05";
	        String comando_10 = ", tpdep_05";
	        String comando_11  = ", pdep_06";
	        String comando_12 = ", tpdep_06";
	        String comando_13  = ", pdep_07";
	        String comando_14 = ", tpdep_07";
	        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

	        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
	                comando_01, seleccion_01,
	                comando_02, tiempo_01,
	                comando_03, seleccion_02,
	                comando_04, tiempo_02,
	                comando_05, seleccion_03,
	                comando_06, tiempo_03,
	                comando_07, seleccion_04,
	                comando_08, tiempo_04,
	                comando_09, seleccion_05,
	                comando_10, tiempo_05,
	                comando_11, seleccion_06,
	                comando_12, tiempo_06,
	                comando_13, seleccion_07,
	                comando_14, tiempo_07,
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