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
public class CuestionarioBarthel extends Activity{
	
	RadioButton independiente20,dependiente20;
    RadioButton independiente21,ayuda21,dependiente21;
    RadioButton independiente22,dependiente22;
    RadioButton independiente23,ayuda23,dependiente23;
    RadioButton independiente24,ayuda24,dependiente24;
    RadioButton independiente25,minimaayuda25,granayuda25;
    RadioButton independiente26,ayuda26,independientesilla26,dependiente26;
    RadioButton continente27,incontinenciaocasional27,incontinente27;
    RadioButton continente28,incontinenteocasional28,incontinente28;
    RadioButton continente29,ayuda29,dependiente29;
    
    RadioGroup radioGroupP20,radioGroupP21,radioGroupP22,radioGroupP23,radioGroupP24,radioGroupP25;
    RadioGroup radioGroupP26,radioGroupP27,radioGroupP28,radioGroupP29;
    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private String el_registro;
    private static String la_tableta;
    private static String el_encuesto;
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
    private int seleccion_08;
    private String tiempo_08;
    private  int seleccion_09;
    private String tiempo_09;
    private  int seleccion_10;
    private  String tiempo_10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuestionario_barthel);
		
		 Date date = new Date();
	        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
	        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";


	        independiente20 = (RadioButton)findViewById(R.id.independiente20);
	        dependiente20 = (RadioButton)findViewById(R.id.dependiente20);

	        independiente21 = (RadioButton)findViewById(R.id.independiente21);
	        ayuda21 = (RadioButton)findViewById(R.id.ayuda21);
	        dependiente21 = (RadioButton)findViewById(R.id.dependiente21);

	        independiente22 = (RadioButton)findViewById(R.id.independiente22);
	        dependiente22 = (RadioButton)findViewById(R.id.dependiente22);

	        independiente23 = (RadioButton)findViewById(R.id.independiente23);
	        ayuda23 = (RadioButton)findViewById(R.id.ayuda23);
	        dependiente23 = (RadioButton)findViewById(R.id.dependiente23);

	        independiente24 = (RadioButton)findViewById(R.id.independiente24);
	        ayuda24 = (RadioButton)findViewById(R.id.ayuda24);
	        dependiente24 = (RadioButton)findViewById(R.id.dependiente24);

	        independiente25 = (RadioButton)findViewById(R.id.independiente25);
	        minimaayuda25 = (RadioButton)findViewById(R.id.minimaayuda25);
	        granayuda25 = (RadioButton)findViewById(R.id.granayuda25);

	        independiente26 = (RadioButton)findViewById(R.id.independiente26);
	        ayuda26 = (RadioButton)findViewById(R.id.ayuda26);
	        independientesilla26 = (RadioButton)findViewById(R.id.independientesilla26);
	        dependiente26 = (RadioButton)findViewById(R.id.dependiente26);

	        continente27 = (RadioButton)findViewById(R.id.continente27);
	        incontinenciaocasional27 = (RadioButton)findViewById(R.id.incontingenciaocas27);
	        incontinente27 = (RadioButton)findViewById(R.id.incontinente27);

	        continente28 = (RadioButton)findViewById(R.id.continente28);
	        incontinenteocasional28 = (RadioButton)findViewById(R.id.incontingenciaocas28);
	        incontinente28 = (RadioButton)findViewById(R.id.incontinente28);

	        continente29 = (RadioButton)findViewById(R.id.continente29);
	        ayuda29 = (RadioButton)findViewById(R.id.ayuda29);
	        dependiente29 = (RadioButton)findViewById(R.id.dependiente29);

	        radioGroupP20 = (RadioGroup)findViewById(R.id.radioGroupPregunta20);
	        radioGroupP21 = (RadioGroup)findViewById(R.id.radioGroupPregunta21);
	        radioGroupP22 = (RadioGroup)findViewById(R.id.RadioGroupPregunta22);
	        radioGroupP23 = (RadioGroup)findViewById(R.id.RadioGroupPregunta23);
	        radioGroupP24 = (RadioGroup)findViewById(R.id.RadioGroupPregunta24);
	        radioGroupP25 = (RadioGroup)findViewById(R.id.RadioGroupPregunta25);
	        radioGroupP26 = (RadioGroup)findViewById(R.id.radioGroupPregunta26);
	        radioGroupP27 = (RadioGroup)findViewById(R.id.RadioGroupPregunta27);
	        radioGroupP28 = (RadioGroup)findViewById(R.id.RadioGroupPregunta28);
	        radioGroupP29 = (RadioGroup)findViewById(R.id.RadioGroupPregunta29);
	
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

	        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0201(comando_1);
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
	        
	        radioGroupP20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente20:
	                        matriz[12] = "1";
	                        matriz[13] = me_das_tu_ora();
	                        seleccion_01 = 1;
	                        tiempo_01 = me_das_tu_ora();
	                        break;
	                    case R.id.dependiente20:
	                        matriz[12] = "2";
	                        matriz[13] = me_das_tu_ora();
	                        seleccion_01 = 2;
	                        tiempo_01 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });
	        radioGroupP21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente21:
	                        matriz[14] = "1";
	                        matriz[15] = me_das_tu_ora();
	                        seleccion_02 = 1;
	                        tiempo_02 = me_das_tu_ora();
	                        break;
	                    case R.id.ayuda21:
	                        matriz[14] = "2";
	                        matriz[15] = me_das_tu_ora();
	                        seleccion_02 = 2;
	                        tiempo_02 = me_das_tu_ora();
	                        break;
	                    case R.id.dependiente21:
	                        matriz[14] = "3";
	                        matriz[15] = me_das_tu_ora();
	                        seleccion_02 = 2;
	                        tiempo_02 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente22:
	                        matriz[16] = "1";
	                        matriz[17] = me_das_tu_ora();
	                        seleccion_03 = 1;
	                        tiempo_03 = me_das_tu_ora();
	                        break;
	                    case R.id.dependiente22:
	                        matriz[16] = "2";
	                        matriz[17] = me_das_tu_ora();
	                        seleccion_03 = 2;
	                        tiempo_03 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente23:
	                        matriz[18] = "1";
	                        matriz[19] = me_das_tu_ora();
	                        seleccion_04 = 1;
	                        tiempo_04 = me_das_tu_ora();
	                        break;
	                    case R.id.ayuda23:
	                        matriz[18] = "2";
	                        matriz[19] = me_das_tu_ora();
	                        seleccion_04 = 2;
	                        tiempo_04 = me_das_tu_ora();
	                    case R.id.dependiente23:
	                        matriz[16] = "3";
	                        matriz[17] = me_das_tu_ora();
	                        seleccion_04 = 3;
	                        tiempo_04 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente24:
	                        matriz[20] = "1";
	                        matriz[21] = me_das_tu_ora();
	                        seleccion_05 = 1;
	                        tiempo_05 = me_das_tu_ora();
	                        break;
	                    case R.id.ayuda24:
	                        matriz[20] = "2";
	                        matriz[21] = me_das_tu_ora();
	                        seleccion_05 = 2;
	                        tiempo_05 = me_das_tu_ora();
	                    case R.id.dependiente24:
	                        matriz[20] = "3";
	                        matriz[21] = me_das_tu_ora();
	                        seleccion_05 = 3;
	                        tiempo_05 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente25:
	                        matriz[22] = "1";
	                        matriz[23] = me_das_tu_ora();
	                        seleccion_06 = 1;
	                        tiempo_06 = me_das_tu_ora();
	                        break;
	                    case R.id.minimaayuda25:
	                        matriz[22] = "2";
	                        matriz[23] = me_das_tu_ora();
	                        seleccion_06 = 2;
	                        tiempo_06 = me_das_tu_ora();
	                    case R.id.granayuda25:
	                        matriz[22] = "3";
	                        matriz[23] = me_das_tu_ora();
	                        seleccion_06 = 3;
	                        tiempo_06 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.independiente26:
	                        matriz[24] = "1";
	                        matriz[25] = me_das_tu_ora();
	                        seleccion_07 = 1;
	                        tiempo_07 = me_das_tu_ora();
	                        break;
	                    case R.id.ayuda26:
	                        matriz[24] = "2";
	                        matriz[25] = me_das_tu_ora();
	                        seleccion_07 = 2;
	                        tiempo_07 = me_das_tu_ora();
	                    case R.id.independientesilla26:
	                        matriz[24] = "3";
	                        matriz[25] = me_das_tu_ora();
	                        seleccion_07 = 3;
	                        tiempo_07 = me_das_tu_ora();
	                        break;
	                    case R.id.dependiente26:
	                        matriz[24] = "4";
	                        matriz[25] = me_das_tu_ora();
	                        seleccion_07 = 4;
	                        tiempo_07 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.continente27:
	                        matriz[26] = "1";
	                        matriz[27] = me_das_tu_ora();
	                        seleccion_08 = 1;
	                        tiempo_08 = me_das_tu_ora();
	                        break;
	                    case R.id.incontingenciaocas27:
	                        matriz[26] = "2";
	                        matriz[27] = me_das_tu_ora();
	                        seleccion_08 = 2;
	                        tiempo_08 = me_das_tu_ora();
	                    case R.id.incontinente27:
	                        matriz[26] = "3";
	                        matriz[27] = me_das_tu_ora();
	                        seleccion_08 = 3;
	                        tiempo_08 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	            
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.continente28:
	                        matriz[28] = "1";
	                        matriz[29] = me_das_tu_ora();
	                        seleccion_09 = 1;
	                        tiempo_09 = me_das_tu_ora();
	                        break;
	                    case R.id.incontingenciaocas28:
	                        matriz[28] = "2";
	                        matriz[29] = me_das_tu_ora();
	                        seleccion_09 = 2;
	                        tiempo_09 = me_das_tu_ora();
	                    case R.id.incontinente28:
	                        matriz[28] = "3";
	                        matriz[29] = me_das_tu_ora();
	                        seleccion_09 = 3;
	                        tiempo_09 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });

	        radioGroupP29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
	           
	            public void onCheckedChanged (RadioGroup group, int checkedId) {
	                switch (checkedId)
	                {
	                    case R.id.continente29:
	                        matriz[30] = "1";
	                        matriz[31] = me_das_tu_ora();
	                        seleccion_10 = 1;
	                        tiempo_10 = me_das_tu_ora();
	                        break;
	                    case R.id.ayuda29:
	                        matriz[30] = "2";
	                        matriz[31] = me_das_tu_ora();
	                        seleccion_10 = 2;
	                        tiempo_10 = me_das_tu_ora();
	                    case R.id.dependiente29:
	                        matriz[30] = "3";
	                        matriz[31] = me_das_tu_ora();
	                        seleccion_10 = 3;
	                        tiempo_10 = me_das_tu_ora();
	                        break;

	                }
	            }
	        });
	
	}
	
	public void siguienteBarthel(View view){
        Intent finbar = new Intent(this,CuestionarioMiniMentalPrimero.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pb_01";
        String comando_02 = ", tb_01";
        String comando_03  = ", pb_02";
        String comando_04 = ", tb_02";
        String comando_05  = ", pb_03";
        String comando_06 = ", tb_03";
        String comando_07  = ", pb_04";
        String comando_08 = ", tb_04";
        String comando_09  = ", pb_05";
        String comando_10 = ", tb_05";
        String comando_11  = ", pb_06";
        String comando_12 = ", tb_06";
        String comando_13  = ", pb_07";
        String comando_14 = ", tb_07";
        String comando_15 = ", pb_08";
        String comando_16 = ", tb_08";
        String comando_17 = ", pb_09";
        String comando_18 = ", tb_09";
        String comando_19 = ", pb_10";
        String comando_20 = ", tb_10";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
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
                comando_15, seleccion_08,
                comando_16, tiempo_08,
                comando_17, seleccion_09,
                comando_18, tiempo_09,
                comando_19, seleccion_10,
                comando_20, tiempo_10,
                comando_50);
        startActivity(finbar);
    }
	
	public void barthelAbortar(View view){
        Intent barthelabortar = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pb_01";
        String comando_02 = ", tb_01";
        String comando_03  = ", pb_02";
        String comando_04 = ", tb_02";
        String comando_05  = ", pb_03";
        String comando_06 = ", tb_03";
        String comando_07  = ", pb_04";
        String comando_08 = ", tb_04";
        String comando_09  = ", pb_05";
        String comando_10 = ", tb_05";
        String comando_11  = ", pb_06";
        String comando_12 = ", tb_06";
        String comando_13  = ", pb_07";
        String comando_14 = ", tb_07";
        String comando_15 = ", pb_08";
        String comando_16 = ", tb_08";
        String comando_17 = ", pb_09";
        String comando_18 = ", tb_09";
        String comando_19 = ", pb_10";
        String comando_20 = ", tb_10";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
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
                comando_15, seleccion_08,
                comando_16, tiempo_08,
                comando_17, seleccion_09,
                comando_18, tiempo_09,
                comando_19, seleccion_10,
                comando_20, tiempo_10,
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