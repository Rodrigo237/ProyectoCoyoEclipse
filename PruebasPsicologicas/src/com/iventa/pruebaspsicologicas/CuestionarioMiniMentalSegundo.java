package com.iventa.pruebaspsicologicas;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint("SimpleDateFormat")
public class CuestionarioMiniMentalSegundo extends Activity{
	
    CheckBox Pregunta46,Pregunta47R1,Pregunta47R2,Pregunta47R3;
    CheckBox  Pregunta48,Pregunta49,Pregunta50;
    
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
    private int seleccion_02R1;
    private String tiempo_02R1;
    private int seleccion_02R2;
    private String tiempo_02R2;
    private int seleccion_02R3;
    private String tiempo_02R3;
    private int seleccion_03;
    private String tiempo_03;
    private int seleccion_04;
    private String tiempo_04;
    private int seleccion_05;
    private String tiempo_05;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_mental_segundo);
		
		Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";
		
			Pregunta46 = (CheckBox)findViewById(R.id.checkBox46);
	        Pregunta47R1 = (CheckBox)findViewById(R.id.checkBox47R1);
	        Pregunta47R2 = (CheckBox)findViewById(R.id.checkBox47R2);
	        Pregunta47R3 = (CheckBox)findViewById(R.id.checkBox47R3);
	        Pregunta48 = (CheckBox)findViewById(R.id.checkBox48);
	        Pregunta49 = (CheckBox)findViewById(R.id.checkBox49);
	        Pregunta50 = (CheckBox)findViewById(R.id.checkBox50);
	        
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

	        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0207(comando_1);
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
	        
	        if (Pregunta46.isChecked())
	        {
	            matriz[12] = "1";
	            matriz[13] = me_das_tu_ora();
	            seleccion_01 = 1;
	            tiempo_01 = me_das_tu_ora();
	        }else if (!Pregunta46.isChecked())
	        {
	            matriz[12] = "0";
	            matriz[13] = me_das_tu_ora();
	            seleccion_01 = 0;
	            tiempo_01 = me_das_tu_ora();
	        }

	        if (Pregunta47R1.isChecked())
	        {
	            matriz[14] = "1";
	            matriz[15] = me_das_tu_ora();
	            seleccion_02R1 = 1;
	            tiempo_02R1 = me_das_tu_ora();
	        }else if (!Pregunta47R1.isChecked())
	        {
	            matriz[14] = "0";
	            matriz[15] = me_das_tu_ora();
	            seleccion_02R1 = 0;
	            tiempo_02R1 = me_das_tu_ora();
	        }

	        if (Pregunta47R2.isChecked())
	        {
	            matriz[16] = "1";
	            matriz[17] = me_das_tu_ora();
	            seleccion_02R2 = 1;
	            tiempo_02R2 = me_das_tu_ora();
	        }else if (!Pregunta47R2.isChecked())
	        {
	            matriz[16] = "0";
	            matriz[17] = me_das_tu_ora();
	            seleccion_02R2 = 0;
	            tiempo_02R2 = me_das_tu_ora();
	        }

	        if (Pregunta47R3.isChecked())
	        {
	            matriz[18] = "1";
	            matriz[19] = me_das_tu_ora();
	            seleccion_02R3 = 1;
	            tiempo_02R3 = me_das_tu_ora();
	        }else if (!Pregunta47R3.isChecked())
	        {
	            matriz[18] = "0";
	            matriz[19] = me_das_tu_ora();
	            seleccion_02R3 = 0;
	            tiempo_02R3 = me_das_tu_ora();
	        }

	        if (Pregunta48.isChecked())
	        {
	            matriz[20] = "1";
	            matriz[21] = me_das_tu_ora();
	            seleccion_03 = 1;
	            tiempo_03 = me_das_tu_ora();
	        }else if (!Pregunta48.isChecked())
	        {
	            matriz[20] = "0";
	            matriz[21] = me_das_tu_ora();
	            seleccion_03 = 0;
	            tiempo_03 = me_das_tu_ora();
	        }
	        if (Pregunta49.isChecked())
	        {
	            matriz[22] = "1";
	            matriz[23] = me_das_tu_ora();
	            seleccion_04 = 1;
	            tiempo_04 = me_das_tu_ora();
	        }else if (!Pregunta49.isChecked())
	        {
	            matriz[22] = "0";
	            matriz[23] = me_das_tu_ora();
	            seleccion_04 = 0;
	            tiempo_04 = me_das_tu_ora();
	        }
	        if (Pregunta50.isChecked())
	        {
	            matriz[24] = "1";
	            matriz[25] = me_das_tu_ora();
	            seleccion_05 = 1;
	            tiempo_05 = me_das_tu_ora();
	        }else if (!Pregunta50.isChecked())
	        {
	            matriz[24] = "0";
	            matriz[25] = me_das_tu_ora();
	            seleccion_05 = 0;
	            tiempo_05 = me_das_tu_ora();
	        }

	}
	
	public void miniMentalFinalizar(View view)
    {
		Intent miniFinalizar = new Intent(this,CuestionarioTerminacion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = ", mi_17";
        String comando_02 = ", tmi_17";
        String comando_03 = "mi_18r1";
        String comando_04 = "tmi_18r1";
        String comando_05 = "mi_18r2";
        String comando_06 = "tmi_18r2";
        String comando_07 = "mi_18r3";
        String comando_08 = "tmi_18r3";
        String comando_09 = ", mi_19";
        String comando_10 = ", tmi_19";
        String comando_11 = ", mi_20";
        String comando_12 = ", tmi_20";
        String comando_13 = ", mi_21";
        String comando_14 = ", tmi_21";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        
        fuenteCuestionarioBasico.guardarCaptura_0207(comando_00,
                comando_01, seleccion_01,
                comando_02, tiempo_01,
                comando_03, seleccion_02R1,
                comando_04, tiempo_02R1,
                comando_05, seleccion_02R2,
                comando_06, tiempo_02R2,
                comando_07, seleccion_02R3,
                comando_08, tiempo_02R3,
                comando_09, seleccion_03,
                comando_10, tiempo_03,
                comando_11, seleccion_04,
                comando_12, tiempo_04,
                comando_13, seleccion_05,
                comando_14, tiempo_05,
                comando_50);
        startActivity(miniFinalizar);
    }
	
	public void miniMentalAbortarSegundo(View view)
    {
		Intent miniFinalizarAbortar = new Intent(this,CuestionarioTerminacion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = ", mi_17";
        String comando_02 = ", tmi_17";
        String comando_03 = "mi_18r1";
        String comando_04 = "tmi_18r1";
        String comando_05 = "mi_18r2";
        String comando_06 = "tmi_18r2";
        String comando_07 = "mi_18r3";
        String comando_08 = "tmi_18r3";
        String comando_09 = ", mi_19";
        String comando_10 = ", tmi_19";
        String comando_11 = ", mi_20";
        String comando_12 = ", tmi_20";
        String comando_13 = ", mi_21";
        String comando_14 = ", tmi_21";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        
        fuenteCuestionarioBasico.guardarCaptura_0207(comando_00,
                comando_01, seleccion_01,
                comando_02, tiempo_01,
                comando_03, seleccion_02R1,
                comando_04, tiempo_02R1,
                comando_05, seleccion_02R2,
                comando_06, tiempo_02R2,
                comando_07, seleccion_02R3,
                comando_08, tiempo_02R3,
                comando_09, seleccion_03,
                comando_10, tiempo_03,
                comando_11, seleccion_04,
                comando_12, tiempo_04,
                comando_13, seleccion_05,
                comando_14, tiempo_05,
                comando_50);
        startActivity(miniFinalizarAbortar);
    }
	
    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}