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
public class CuestionarioMiniMentalPrimero extends Activity{
	
	CheckBox Pregunta30,Pregunta31,Pregunta32,Pregunta33,Pregunta34;
    CheckBox Pregunta35,Pregunta36,Pregunta37,Pregunta38,Pregunta39;
    CheckBox Pregunta40,Pregunta41R1,Pregunta41R2,Pregunta41R3;
    CheckBox Pregunta42R1,Pregunta42R2,Pregunta42R3,Pregunta42R4,Pregunta42R5;
	CheckBox Pregunta43,Pregunta44R1,Pregunta44R2,Pregunta44R3,Pregunta45R1,Pregunta45R2;
   
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
	    private int seleccion_11;
	    private String tiempo_11;
	    private int seleccion_12R1;
	    private String tiempo_12R1;
	    private int seleccion_12R2;
	    private String tiempo_12R2;
	    private  int seleccion_12R3;
	    private String tiempo_12R3;
	    private int seleccion_13R1;
	    private String tiempo_13R1;
	    private int seleccion_13R2;
	    private String tiempo_13R2;
	    private int seleccion_13R3;
	    private String tiempo_13R3;
	    private int seleccion_13R4;
	    private String tiempo_13R4;
	    private int seleccion_13R5;
	    private String tiempo_13R5;
	    private int seleccion_14;
	    private String tiempo_14;
	    private int seleccion_15R1;
	    private String tiempo_15R1;
	    private int seleccion_15R2;
	    private String tiempo_15R2;
	    private int seleccion_15R3;
	    private String tiempo_15R3;
	    private int seleccion_16R1;
	    private String tiempo_16R1;
	    private int seleccion_16R2;
	    private String tiempo_16R2;
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_mental_primero);
	
		Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";
		
		Pregunta30 = (CheckBox)findViewById(R.id.checkBox30);
        Pregunta31 = (CheckBox)findViewById(R.id.checkBox31);
        Pregunta32 = (CheckBox)findViewById(R.id.checkBox32);
        Pregunta33 = (CheckBox)findViewById(R.id.checkBox33);
        Pregunta34 = (CheckBox)findViewById(R.id.checkBox34);
        Pregunta35 = (CheckBox)findViewById(R.id.checkBox35);
        Pregunta36 = (CheckBox)findViewById(R.id.checkBox36);
        Pregunta37 = (CheckBox)findViewById(R.id.checkBox37);
        Pregunta38 = (CheckBox)findViewById(R.id.checkBox38);
        Pregunta39 = (CheckBox)findViewById(R.id.checkBox39);
        Pregunta40 = (CheckBox)findViewById(R.id.checkBox40);
        Pregunta41R1 = (CheckBox)findViewById(R.id.checkBox41R1);
        Pregunta41R2 = (CheckBox)findViewById(R.id.checkBox41R2);
        Pregunta41R3 = (CheckBox)findViewById(R.id.checkBox41R3);
        Pregunta42R1 = (CheckBox)findViewById(R.id.checkBox42R1);
        Pregunta42R2 = (CheckBox)findViewById(R.id.checkBox42R2);
        Pregunta42R3 = (CheckBox)findViewById(R.id.checkBox42R3);
        Pregunta42R4 = (CheckBox)findViewById(R.id.checkBox42R4);
        Pregunta42R5 = (CheckBox)findViewById(R.id.checkBox42R5);
        Pregunta43 = (CheckBox)findViewById(R.id.checkBox43);
        Pregunta44R1 = (CheckBox)findViewById(R.id.checkBox44R1);
        Pregunta44R2 = (CheckBox)findViewById(R.id.checkBox44R2);
        Pregunta44R3 = (CheckBox)findViewById(R.id.checkBox44R3);
        Pregunta45R1 = (CheckBox)findViewById(R.id.checkBox45R1);
        Pregunta45R2 = (CheckBox)findViewById(R.id.checkBox45R2);
        
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



        if (Pregunta30.isChecked())
        {
            matriz[12] = "1";
            matriz[13] = me_das_tu_ora();
            seleccion_01 = 1;
            tiempo_01 = me_das_tu_ora();
        }else if (!Pregunta30.isChecked()) {
            matriz[12] = "0";
            matriz[13] = me_das_tu_ora();
            seleccion_01 = 0;
            tiempo_01 = me_das_tu_ora();
        }

        if (Pregunta31.isChecked())
        {
            matriz[14] = "1";
            matriz[15] = me_das_tu_ora();
            seleccion_02 = 1;
            tiempo_02 = me_das_tu_ora();
        }else if (!Pregunta31.isChecked())
        {
            matriz[14] = "0";
            matriz[15] = me_das_tu_ora();
            seleccion_02 = 0;
            tiempo_02 = me_das_tu_ora();
        }

        if (Pregunta32.isChecked())
        {
            matriz[16] = "1";
            matriz[17] = me_das_tu_ora();
            seleccion_03 = 1;
            tiempo_03 = me_das_tu_ora();
        }else if (!Pregunta32.isChecked())
        {
            matriz[16] = "0";
            matriz[17] = me_das_tu_ora();
            seleccion_03 = 0;
            tiempo_03 = me_das_tu_ora();
        }

        if (Pregunta33.isChecked())
        {
            matriz[18] = "1";
            matriz[19] = me_das_tu_ora();
            seleccion_04 = 1;
            tiempo_04 = me_das_tu_ora();
        }else if (!Pregunta33.isChecked())
        {
            matriz[18] = "0";
            matriz[19] = me_das_tu_ora();
            seleccion_04 = 0;
            tiempo_04 = me_das_tu_ora();
        }

        if (Pregunta34.isChecked())
        {
            matriz[20] = "1";
            matriz[21] = me_das_tu_ora();
            seleccion_05 = 1;
            tiempo_05 = me_das_tu_ora();
        }else if (!Pregunta34.isChecked())
        {
            matriz[20] = "0";
            matriz[21] = me_das_tu_ora();
            seleccion_05 = 0;
            tiempo_05 = me_das_tu_ora();
        }

        if (Pregunta35.isChecked())
        {
            matriz[22] = "1";
            matriz[23] = me_das_tu_ora();
            seleccion_06 = 1;
            tiempo_06 = me_das_tu_ora();
        }else if (!Pregunta35.isChecked())
        {
            matriz[22] = "0";
            matriz[23] = me_das_tu_ora();
            seleccion_06 = 0;
            tiempo_06 = me_das_tu_ora();
        }

        if (Pregunta36.isChecked())
        {
            matriz[24] = "1";
            matriz[25] = me_das_tu_ora();
            seleccion_07 = 1;
            tiempo_07 = me_das_tu_ora();
        }else if (!Pregunta36.isChecked())
        {
            matriz[24] = "0";
            matriz[25] = me_das_tu_ora();
            seleccion_07 = 0;
            tiempo_07 = me_das_tu_ora();
        }

        if (Pregunta37.isChecked())
        {
            matriz[26] = "1";
            matriz[27] = me_das_tu_ora();
            seleccion_08 = 1;
            tiempo_08 = me_das_tu_ora();
        }else if (!Pregunta37.isChecked())
        {
            matriz[26] = "0";
            matriz[27] = me_das_tu_ora();
            seleccion_08 = 0;
            tiempo_08 = me_das_tu_ora();
        }

        if (Pregunta38.isChecked())
        {
            matriz[28] = "1";
            matriz[29] = me_das_tu_ora();
            seleccion_09 = 1;
            tiempo_09 = me_das_tu_ora();
        }else if (!Pregunta38.isChecked())
        {
            matriz[28] = "0";
            matriz[29] = me_das_tu_ora();
            seleccion_09 = 0;
            tiempo_09 = me_das_tu_ora();
        }

        if (Pregunta39.isChecked())
        {
            matriz[30] = "1";
            matriz[31] = me_das_tu_ora();
            seleccion_10 = 1;
            tiempo_10 = me_das_tu_ora();
        }else if (!Pregunta39.isChecked())
        {
            matriz[30] = "0";
            matriz[31] = me_das_tu_ora();
            seleccion_10 = 0;
            tiempo_10 = me_das_tu_ora();
        }

        if (Pregunta40.isChecked())
        {
            matriz[32] = "1";
            matriz[33] = me_das_tu_ora();
            seleccion_11 = 1;
            tiempo_11 = me_das_tu_ora();
        }else if (!Pregunta40.isChecked())
        {
            matriz[32] = "0";
            matriz[33] = me_das_tu_ora();
            seleccion_11 = 0;
            tiempo_11 = me_das_tu_ora();
        }

        if (Pregunta41R1.isChecked())
        {
            matriz[33] = "1";
            matriz[34] = me_das_tu_ora();
            seleccion_12R1 = 1;
            tiempo_12R1 = me_das_tu_ora();
        }else if (!Pregunta41R1.isChecked())
        {
            matriz[33] = "0";
            matriz[34] = me_das_tu_ora();
            seleccion_12R1 = 0;
            tiempo_12R1 = me_das_tu_ora();
        }

        if (Pregunta41R2.isChecked())
        {
            matriz[35] = "1";
            matriz[36] = me_das_tu_ora();
            seleccion_12R2 = 1;
            tiempo_12R2 = me_das_tu_ora();
        }else if (!Pregunta41R2.isChecked())
        {
            matriz[35] = "0";
            matriz[36] = me_das_tu_ora();
            seleccion_12R2 = 0;
            tiempo_12R2 = me_das_tu_ora();
        }

        if (Pregunta41R3.isChecked())
        {
            matriz[37] = "1";
            matriz[38] = me_das_tu_ora();
            seleccion_12R3 = 1;
            tiempo_12R3 = me_das_tu_ora();
        }else if (!Pregunta41R3.isChecked())
        {
            matriz[37] = "0";
            matriz[38] = me_das_tu_ora();
            seleccion_12R3 = 0;
            tiempo_12R3 = me_das_tu_ora();
        }
        
        if (Pregunta42R1.isChecked())
        {
            matriz[39] = "1";
            matriz[40] = me_das_tu_ora();
            seleccion_13R1 = 1;
            tiempo_13R1 = me_das_tu_ora();
        }else if (!Pregunta42R1.isChecked())
        {
            matriz[39] = "0";
            matriz[40] = me_das_tu_ora();
            seleccion_13R1 = 0;
            tiempo_13R1 = me_das_tu_ora();
        }
        
        if (Pregunta42R2.isChecked())
        {
            matriz[41] = "1";
            matriz[42] = me_das_tu_ora();
            seleccion_13R2 = 1;
            tiempo_13R2 = me_das_tu_ora();
        }else if (!Pregunta42R2.isChecked())
        {
            matriz[41] = "0";
            matriz[42] = me_das_tu_ora();
            seleccion_13R2 = 0;
            tiempo_13R2 = me_das_tu_ora();
        }
        
        if (Pregunta42R3.isChecked())
        {
            matriz[43] = "1";
            matriz[44] = me_das_tu_ora();
            seleccion_13R3 = 1;
            tiempo_13R3 = me_das_tu_ora();
        }else if (!Pregunta42R3.isChecked())
        {
            matriz[43] = "0";
            matriz[44] = me_das_tu_ora();
            seleccion_13R3 = 0;
            tiempo_13R3 = me_das_tu_ora();
        }
        
        if (Pregunta42R4.isChecked())
        {
            matriz[45] = "1";
            matriz[46] = me_das_tu_ora();
            seleccion_13R4 = 1;
            tiempo_13R4 = me_das_tu_ora();
        }else if (!Pregunta42R4.isChecked())
        {
            matriz[45] = "0";
            matriz[46] = me_das_tu_ora();
            seleccion_13R4 = 0;
            tiempo_13R4 = me_das_tu_ora();
        }
        
        if (Pregunta42R5.isChecked())
        {
            matriz[47] = "1";
            matriz[48] = me_das_tu_ora();
            seleccion_13R5 = 1;
            tiempo_13R5 = me_das_tu_ora();
        }else if (!Pregunta42R5.isChecked())
        {
            matriz[47] = "0";
            matriz[48] = me_das_tu_ora();
            seleccion_13R5 = 0;
            tiempo_13R5 = me_das_tu_ora();
        }
        
        if (Pregunta43.isChecked())
        {
            matriz[49] = "1";
            matriz[50] = me_das_tu_ora();
            seleccion_14 = 1;
            tiempo_14 = me_das_tu_ora();
        }else if (!Pregunta43.isChecked())
        {
            matriz[49] = "0";
            matriz[50] = me_das_tu_ora();
            seleccion_14 = 0;
            tiempo_14 = me_das_tu_ora();
        }
        
        if (Pregunta44R1.isChecked())
        {
            matriz[51] = "1";
            matriz[52] = me_das_tu_ora();
            seleccion_15R1 = 1;
            tiempo_15R1 = me_das_tu_ora();
        }else if (!Pregunta44R1.isChecked())
        {
            matriz[51] = "0";
            matriz[52] = me_das_tu_ora();
            seleccion_15R1 = 0;
            tiempo_15R1 = me_das_tu_ora();
        }
        
        if (Pregunta44R2.isChecked())
        {
            matriz[53] = "1";
            matriz[54] = me_das_tu_ora();
            seleccion_15R2 = 1;
            tiempo_15R2 = me_das_tu_ora();
        }else if (!Pregunta44R2.isChecked())
        {
            matriz[53] = "0";
            matriz[54] = me_das_tu_ora();
            seleccion_15R2 = 0;
            tiempo_15R2 = me_das_tu_ora();
        }
        
        if (Pregunta44R3.isChecked())
        {
            matriz[55] = "1";
            matriz[56] = me_das_tu_ora();
            seleccion_15R3 = 1;
            tiempo_15R3 = me_das_tu_ora();
        }else if (!Pregunta44R3.isChecked())
        {
            matriz[55] = "0";
            matriz[56] = me_das_tu_ora();
            seleccion_15R3 = 0;
            tiempo_15R3 = me_das_tu_ora();
        }
        
        if (Pregunta45R1.isChecked())
        {
            matriz[57] = "1";
            matriz[58] = me_das_tu_ora();
            seleccion_16R1 = 1;
            tiempo_16R1 = me_das_tu_ora();
        }else if (!Pregunta45R1.isChecked())
        {
            matriz[57] = "0";
            matriz[58] = me_das_tu_ora();
            seleccion_16R1 = 0;
            tiempo_16R1 = me_das_tu_ora();
        }
        
        if (Pregunta45R2.isChecked())
        {
            matriz[59] = "1";
            matriz[60] = me_das_tu_ora();
            seleccion_16R2 = 1;
            tiempo_16R2 = me_das_tu_ora();
        }else if (!Pregunta45R2.isChecked())
        {
            matriz[59] = "0";
            matriz[60] = me_das_tu_ora();
            seleccion_16R2 = 0;
            tiempo_16R2 = me_das_tu_ora();
        }
	}

    public void miniMentalSiguientePrimero(View view)
    {
        Intent minisiguiente = new Intent(this,CuestionarioMiniMentalSegundo.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", mi_01";
        String comando_02 = ", tmi_01";
        String comando_03  = ", mi_02";
        String comando_04 = ", tmi_02";
        String comando_05  = ", mi_03";
        String comando_06 = ", tmi_03";
        String comando_07  = ", mi_04";
        String comando_08 = ", tmi_04";
        String comando_09  = ", mi_05";
        String comando_10 = ", tmi_05";
        String comando_11  = ", mi_06";
        String comando_12 = ", tmi_06";
        String comando_13  = ", mi_07";
        String comando_14 = ", tmi_07";
        String comando_15 = ", mi_08";
        String comando_16 = ", tmi_08";
        String comando_17 = ", mi_09";
        String comando_18 = ", tmi_09";
        String comando_19 = ", mi_10";
        String comando_20 = ", tmi_10";
        String comando_21 = ", mi_11";
        String comando_22 = ", tmi_11";
        String comando_23 = ", mi_12r1";
        String comando_24 = ", tmi_12r1";
        String comando_25 = "mi_12r2";
        String comando_26 = "tmi_12r2";
        String comando_27 = "mi_12r3";
        String comando_28 = "tmi_12r3";
        String comando_29  = ", mi_13r1";
        String comando_30 = ", tmi_13r1";
        String comando_31  = ", mi_13r2";
        String comando_32 = ", tmi_13r2";
        String comando_33  = ", mi_13r3";
        String comando_34 = ", tmi_13r3";
        String comando_35  = ", mi_13r4";
        String comando_36 = ", tmi_13r4";
        String comando_37  = ", mi_13r5";
        String comando_38 = ", tmi_13r5";
        String comando_39  = ", mi_14";
        String comando_40 = ", tmi_14";
        String comando_41  = ", mi_15r1";
        String comando_42 = ", tmi_15r1";
        String comando_43 = ", mi_15r2";
        String comando_44 = ", tmi_15r2";
        String comando_45 = ", mi_15r3";
        String comando_46 = ", tmi_15r3";
        String comando_47 = ", mi_16r1";
        String comando_48 = ", tmi_16r1";
        String comando_49 = ", mi_16r2";
        String comando_51 = ", tmi_16r2";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0204(comando_00,
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
                comando_21, seleccion_11,
                comando_22, tiempo_11,
                comando_23, seleccion_12R1,
                comando_24,tiempo_12R1,
                comando_25, seleccion_12R2,
                comando_26, tiempo_12R2,
                comando_27,seleccion_12R3,
                comando_28,tiempo_12R3,
                comando_29, seleccion_13R1,
                comando_30,tiempo_13R1,
                comando_31, seleccion_13R2,
                comando_32, tiempo_13R2,
                comando_33,seleccion_13R3,
                comando_34,tiempo_13R3,
                comando_35, seleccion_13R4,
                comando_36,tiempo_13R4,
                comando_37, seleccion_13R5,
                comando_38, tiempo_13R5,
                comando_39, seleccion_14,
                comando_40, tiempo_14,
                comando_41, seleccion_15R1,
                comando_42,tiempo_15R1,
                comando_43, seleccion_15R2,
                comando_44, tiempo_15R2,
                comando_45,seleccion_15R3,
                comando_46,tiempo_15R3,
                comando_47, seleccion_16R1,
                comando_48,tiempo_16R1,
                comando_49, seleccion_16R2,
                comando_51, tiempo_16R2,
                comando_50);
        startActivity(minisiguiente);
    }
    
    public void miniMentalAbortarPrimero(View view)
    {
        Intent miniAbortar = new Intent(this,MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", mi_01";
        String comando_02 = ", tmi_01";
        String comando_03  = ", mi_02";
        String comando_04 = ", tmi_02";
        String comando_05  = ", mi_03";
        String comando_06 = ", tmi_03";
        String comando_07  = ", mi_04";
        String comando_08 = ", tmi_04";
        String comando_09  = ", mi_05";
        String comando_10 = ", tmi_05";
        String comando_11  = ", mi_06";
        String comando_12 = ", tmi_06";
        String comando_13  = ", mi_07";
        String comando_14 = ", tmi_07";
        String comando_15 = ", mi_08";
        String comando_16 = ", tmi_08";
        String comando_17 = ", mi_09";
        String comando_18 = ", tmi_09";
        String comando_19 = ", mi_10";
        String comando_20 = ", tmi_10";
        String comando_21 = ", mi_11";
        String comando_22 = ", tmi_11";
        String comando_23 = ", mi_12r1";
        String comando_24 = ", tmi_12r1";
        String comando_25 = "mi_12r2";
        String comando_26 = "tmi_12r2";
        String comando_27 = "mi_12r3";
        String comando_28 = "tmi_12r3";
        String comando_29  = ", mi_13r1";
        String comando_30 = ", tmi_13r1";
        String comando_31  = ", mi_13r2";
        String comando_32 = ", tmi_13r2";
        String comando_33  = ", mi_13r3";
        String comando_34 = ", tmi_13r3";
        String comando_35  = ", mi_13r4";
        String comando_36 = ", tmi_13r4";
        String comando_37  = ", mi_13r5";
        String comando_38 = ", tmi_13r5";
        String comando_39  = ", mi_14";
        String comando_40 = ", tmi_14";
        String comando_41  = ", mi_15r1";
        String comando_42 = ", tmi_15r1";
        String comando_43 = ", mi_15r2";
        String comando_44 = ", tmi_15r2";
        String comando_45 = ", mi_15r3";
        String comando_46 = ", tmi_15r3";
        String comando_47 = ", mi_16r1";
        String comando_48 = ", tmi_16r1";
        String comando_49 = ", mi_16r2";
        String comando_51 = ", tmi_16r2";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0204(comando_00,
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
                comando_21, seleccion_11,
                comando_22, tiempo_11,
                comando_23, seleccion_12R1,
                comando_24,tiempo_12R1,
                comando_25, seleccion_12R2,
                comando_26, tiempo_12R2,
                comando_27,seleccion_12R3,
                comando_28,tiempo_12R3,
                comando_29, seleccion_13R1,
                comando_30,tiempo_13R1,
                comando_31, seleccion_13R2,
                comando_32, tiempo_13R2,
                comando_33,seleccion_13R3,
                comando_34,tiempo_13R3,
                comando_35, seleccion_13R4,
                comando_36,tiempo_13R4,
                comando_37, seleccion_13R5,
                comando_38, tiempo_13R5,
                comando_39, seleccion_14,
                comando_40, tiempo_14,
                comando_41, seleccion_15R1,
                comando_42,tiempo_15R1,
                comando_43, seleccion_15R2,
                comando_44, tiempo_15R2,
                comando_45,seleccion_15R3,
                comando_46,tiempo_15R3,
                comando_47, seleccion_16R1,
                comando_48,tiempo_16R1,
                comando_49, seleccion_16R2,
                comando_51, tiempo_16R2,
                comando_50);
        startActivity(miniAbortar);
    }
	
	 public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }
}