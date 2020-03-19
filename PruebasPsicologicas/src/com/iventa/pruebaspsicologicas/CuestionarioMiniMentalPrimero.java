package com.iventa.pruebaspsicologicas;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint({ "SimpleDateFormat", "Registered" })
public class CuestionarioMiniMentalPrimero extends Activity{
	
//	CheckBox Pregunta30,Pregunta31,Pregunta32,Pregunta33,Pregunta34;
//    CheckBox Pregunta35,Pregunta36,Pregunta37,Pregunta38,Pregunta39;
//    CheckBox Pregunta40,Pregunta41R1,Pregunta41R2,Pregunta41R3;
//    CheckBox Pregunta42R1,Pregunta42R2,Pregunta42R3,Pregunta42R4,Pregunta42R5;
//	CheckBox Pregunta43,Pregunta44R1,Pregunta44R2,Pregunta44R3,Pregunta45R1,Pregunta45R2;
  private CheckBox checkbox_30;
  private int seleccion_30 = 0;
  private String tiempo_30; 
  private CheckBox checkbox_31;
  private int seleccion_31 = 0;
  private String tiempo_31;
  private CheckBox checkbox_32;
  private int seleccion_32 = 0;
  private String tiempo_32;
  private CheckBox checkbox_33;
  private int seleccion_33 = 0;
  private String tiempo_33;
  private CheckBox checkbox_34;
  private int seleccion_34 = 0;
  private String tiempo_34;
  private CheckBox checkbox_35;
  private int seleccion_35 = 0;
  private String tiempo_35;
  private CheckBox checkbox_36;
  private int seleccion_36 = 0;
  private String tiempo_36;
  private CheckBox checkbox_37;
  private int seleccion_37 = 0;
  private String tiempo_37;
  private CheckBox checkbox_38;
  private int seleccion_38 = 0;
  private String tiempo_38;
  private CheckBox checkbox_39;
  private int seleccion_39 = 0;
  private String tiempo_39;
  private CheckBox checkbox_40;
  private int seleccion_40 = 0;
  private String tiempo_40;
  private CheckBox checkbox_41_01;
  private int seleccion_41_01 = 0;
  private String tiempo_41_01;
  private CheckBox checkbox_41_02;
  private int seleccion_41_02 = 0;
  private String tiempo_41_02;
  private CheckBox checkbox_41_03;
  private int seleccion_41_03 = 0;
  private String tiempo_41_03;
  private CheckBox checkbox_42_01;
  private int seleccion_42_01 = 0;
  private String tiempo_42_01;
  private CheckBox checkbox_42_02;
  private int seleccion_42_02 = 0;
  private String tiempo_42_02;
  private CheckBox checkbox_42_03;
  private int seleccion_42_03 = 0;
  private String tiempo_42_03;
  private CheckBox checkbox_42_04;
  private int seleccion_42_04 = 0;
  private String tiempo_42_04;
  private CheckBox checkbox_42_05;
  private int seleccion_42_05 = 0;
  private String tiempo_42_05;
  private CheckBox checkbox_43;
  private int seleccion_43 = 0;
  private String tiempo_43;
  private CheckBox checkbox_44_01;
  private int seleccion_44_01 = 0;
  private String tiempo_44_01;
  private CheckBox checkbox_44_02;
  private int seleccion_44_02 = 0;
  private String tiempo_44_02;
  private CheckBox checkbox_44_03;
  private int seleccion_44_03 = 0;
  private String tiempo_44_03;
  private CheckBox checkbox_45_01;
  private int seleccion_45_01 = 0;
  private String tiempo_45_01;
  private CheckBox checkbox_45_02;
  private int seleccion_45_02 = 0;
  private String tiempo_45_02;
FuenteCuestionarioBasico fuenteCuestionarioBasico;

	    private String el_registro;
	    private static String la_tableta;
	    private static String el_encuesto;
	    private String seleccion_fecha;
	    private String seleccion_hora_ini;
	    private String seleccion_fechor_ini;
	   
	private Button btn_siguiente_mini_primero;
	private Button btn_abortar_mini_primero;
	    
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_mental_primero);
	
		Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";
		
		checkbox_30 = (CheckBox)findViewById(R.id.checkBox30);
		checkbox_31 = (CheckBox)findViewById(R.id.checkBox31);
		checkbox_32 = (CheckBox)findViewById(R.id.checkBox32);
		checkbox_33 = (CheckBox)findViewById(R.id.checkBox33);
		checkbox_34 = (CheckBox)findViewById(R.id.checkBox34);
		checkbox_35 = (CheckBox)findViewById(R.id.checkBox35);
		checkbox_36 = (CheckBox)findViewById(R.id.checkBox36);
		checkbox_37= (CheckBox)findViewById(R.id.checkBox37);
		checkbox_38 = (CheckBox)findViewById(R.id.checkBox38);
		checkbox_39 = (CheckBox)findViewById(R.id.checkBox39);
		checkbox_40 = (CheckBox)findViewById(R.id.checkBox40);
		checkbox_41_01 = (CheckBox)findViewById(R.id.checkBox41_opcion_01);
		checkbox_41_02 = (CheckBox)findViewById(R.id.checkBox41_opcion_02);
		checkbox_41_03 = (CheckBox)findViewById(R.id.checkBox41_opcion_03);
		checkbox_42_01 = (CheckBox)findViewById(R.id.checkBox42_opcion_01);
		checkbox_42_02 = (CheckBox)findViewById(R.id.checkBox42_opcion_02);
		checkbox_42_03 = (CheckBox)findViewById(R.id.checkBox42_opcion_03);
		checkbox_42_04 = (CheckBox)findViewById(R.id.checkBox42_opcion_04);
		checkbox_42_05 = (CheckBox)findViewById(R.id.checkBox42_opcion_05);
		checkbox_43 = (CheckBox)findViewById(R.id.checkBox43);
		checkbox_44_01 = (CheckBox)findViewById(R.id.checkBox44_opcion_01);
		checkbox_44_02 = (CheckBox)findViewById(R.id.checkBox44_opcion_02);
		checkbox_44_03 = (CheckBox)findViewById(R.id.checkBox44_opcion_03);
		checkbox_45_01= (CheckBox)findViewById(R.id.checkBox45_opcion_01);
		checkbox_45_02 = (CheckBox)findViewById(R.id.checkBox45_opcion_02);
        
		btn_siguiente_mini_primero = (Button)findViewById(R.id.btn_siguiente_mini_primero);
	    btn_abortar_mini_primero = (CheckBox)findViewById(R.id.btn_abortar_mini_primero);



        if (checkbox_30.isChecked())
        {
            seleccion_30 = 1;
            tiempo_30 = me_das_tu_ora();
        }else if (!checkbox_30.isChecked()) {
            seleccion_30 = 0;
            tiempo_30 = me_das_tu_ora();
        }

        if (checkbox_31.isChecked())
        {
            seleccion_31 = 1;
            tiempo_31 = me_das_tu_ora();
        }else if (!checkbox_31.isChecked())
        {
            seleccion_31 = 0;
            tiempo_31 = me_das_tu_ora();
        }

        if (checkbox_32.isChecked())
        {
            seleccion_32 = 1;
            tiempo_32 = me_das_tu_ora();
        }else if (!checkbox_32.isChecked())
        {
            seleccion_32 = 0;
            tiempo_32 = me_das_tu_ora();
        }

        if (checkbox_33.isChecked())
        {
            seleccion_33 = 1;
            tiempo_33 = me_das_tu_ora();
        }else if (!checkbox_33.isChecked())
        {
            seleccion_33 = 0;
            tiempo_33 = me_das_tu_ora();
        }

        if (checkbox_34.isChecked())
        {
            seleccion_34 = 1;
            tiempo_34 = me_das_tu_ora();
        }else if (!checkbox_34.isChecked())
        {
            seleccion_34 = 0;
            tiempo_34 = me_das_tu_ora();
        }

        if (checkbox_35.isChecked())
        {
            seleccion_35 = 1;
            tiempo_35 = me_das_tu_ora();
        }else if (!checkbox_35.isChecked())
        {
            seleccion_35 = 0;
            tiempo_35 = me_das_tu_ora();
        }

        if (checkbox_36.isChecked())
        {
            seleccion_36 = 1;
            tiempo_36 = me_das_tu_ora();
        }else if (!checkbox_36.isChecked())
        {
            seleccion_36 = 0;
            tiempo_36 = me_das_tu_ora();
        }

        if (checkbox_37.isChecked())
        {
            seleccion_37 = 1;
            tiempo_37 = me_das_tu_ora();
        }else if (!checkbox_37.isChecked())
        {
            seleccion_37 = 0;
            tiempo_37 = me_das_tu_ora();
        }

        if (checkbox_38.isChecked())
        {
            seleccion_38 = 1;
            tiempo_38 = me_das_tu_ora();
        }else if (!checkbox_38.isChecked())
        {
            seleccion_38 = 0;
            tiempo_38 = me_das_tu_ora();
        }

        if (checkbox_39.isChecked())
        {
            seleccion_39 = 1;
            tiempo_39 = me_das_tu_ora();
        }else if (!checkbox_39.isChecked())
        {
            seleccion_39 = 0;
            tiempo_39 = me_das_tu_ora();
        }

        if (checkbox_40.isChecked())
        {
            seleccion_40 = 1;
            tiempo_40 = me_das_tu_ora();
        }else if (!checkbox_40.isChecked())
        {
            seleccion_40 = 0;
            tiempo_40 = me_das_tu_ora();
        }

        if (checkbox_41_01.isChecked())
        {
            seleccion_41_01 = 1;
            tiempo_41_01 = me_das_tu_ora();
        }else if (!checkbox_41_01.isChecked())
        {
            seleccion_41_01 = 0;
            tiempo_41_01 = me_das_tu_ora();
        }

        if (checkbox_41_02.isChecked())
        {
            seleccion_41_02 = 1;
            tiempo_41_02 = me_das_tu_ora();
        }else if (!checkbox_41_02.isChecked())
        {
            seleccion_41_02 = 0;
            tiempo_41_02 = me_das_tu_ora();
        }

        if (checkbox_41_03.isChecked())
        {
            seleccion_41_03 = 1;
            tiempo_41_03 = me_das_tu_ora();
        }else if (!checkbox_41_03.isChecked())
        {
            seleccion_41_03 = 0;
            tiempo_41_03 = me_das_tu_ora();
        }
        
        if (checkbox_42_01.isChecked())
        {
            seleccion_42_01 = 1;
            tiempo_42_01 = me_das_tu_ora();
        }else if (!checkbox_42_01.isChecked())
        {
            seleccion_42_01 = 0;
            tiempo_42_01 = me_das_tu_ora();
        }
        
        if (checkbox_42_02.isChecked())
        {
            seleccion_42_02 = 1;
            tiempo_42_02 = me_das_tu_ora();
        }else if (!checkbox_42_02.isChecked())
        {
            seleccion_42_02 = 0;
            tiempo_42_02 = me_das_tu_ora();
        }
        
        if (checkbox_42_03.isChecked())
        {
            seleccion_42_03 = 1;
            tiempo_42_03 = me_das_tu_ora();
        }else if (!checkbox_42_03.isChecked())
        {
            seleccion_42_03 = 0;
            tiempo_42_03 = me_das_tu_ora();
        }
        
        if (checkbox_42_04.isChecked())
        {
            seleccion_42_04 = 1;
            tiempo_42_04 = me_das_tu_ora();
        }else if (!checkbox_42_04.isChecked())
        {
            seleccion_42_04 = 0;
            tiempo_42_04 = me_das_tu_ora();
        }
        
        if (checkbox_42_05.isChecked())
        {
            seleccion_42_05 = 1;
            tiempo_42_05 = me_das_tu_ora();
        }else if (!checkbox_42_05.isChecked())
        {
            seleccion_42_05 = 0;
            tiempo_42_05 = me_das_tu_ora();
        }
        
        if (checkbox_43.isChecked())
        {
            seleccion_43 = 1;
            tiempo_43 = me_das_tu_ora();
        }else if (!checkbox_43.isChecked())
        {
            seleccion_43 = 0;
            tiempo_43 = me_das_tu_ora();
        }
        
        if (checkbox_44_01.isChecked())
        {
            seleccion_44_01 = 1;
            tiempo_44_01 = me_das_tu_ora();
        }else if (!checkbox_44_01.isChecked())
        {
            seleccion_44_01 = 0;
            tiempo_44_01 = me_das_tu_ora();
        }
        
        if (checkbox_44_02.isChecked())
        {
            seleccion_44_02 = 1;
            tiempo_44_02 = me_das_tu_ora();
        }else if (!checkbox_44_02.isChecked())
        {
            seleccion_44_02 = 0;
            tiempo_44_02 = me_das_tu_ora();
        }
        
        if (checkbox_44_03.isChecked())
        {
            seleccion_44_03 = 1;
            tiempo_44_03 = me_das_tu_ora();
        }else if (!checkbox_44_03.isChecked())
        {
            seleccion_44_03 = 0;
            tiempo_44_03 = me_das_tu_ora();
        }
        
        if (checkbox_45_01.isChecked())
        {
            seleccion_45_01 = 1;
            tiempo_45_01 = me_das_tu_ora();
        }else if (!checkbox_45_01.isChecked())
        {
            seleccion_45_01 = 0;
            tiempo_45_01 = me_das_tu_ora();
        }
        
        if (checkbox_45_02.isChecked())
        {
            seleccion_45_02 = 1;
            tiempo_45_02 = me_das_tu_ora();
        }else if (!checkbox_45_02.isChecked())
        {
            seleccion_45_02 = 0;
            tiempo_45_02 = me_das_tu_ora();
        }
        

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

        String comando_1 = "SELECT p_3001, " +
                "p_3101, p_3201, p_3301, p_3401, p_3501, " +
                "p_3601, p_3701, p_3801,p_3901, " +
                "p_4001, p_4101, p_4102,p_4103, p_4201, p_4202, p_4203, p_4204, p_4205, p_4301, " +
                "p_4401, p_4402, p_4403, p_4501, p_4502 " +
                "FROM cuestionariobasico " +
                "WHERE registro = " + "'" + el_registro + "'";

        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0204(comando_1);
        fuenteCuestionarioBasico.close();
        
        if((matriz[0] != null)&& (matriz[1] != null)&&(matriz[2] != null)&&(matriz[3] != null)&&
        		(matriz[4] != null)&& (matriz[5] != null)&& (matriz[6] != null) && (matriz[7] != null) &&
        		(matriz[8] != null) && (matriz[9] != null)&& (matriz[10] != null)&& (matriz[11] != null)&&(matriz[12] != null)&&(matriz[13] != null)&&
        		(matriz[14] != null)&& (matriz[15] != null)&& (matriz[16] != null) && (matriz[17] != null) &&
        		(matriz[18] != null) && (matriz[19] != null)&& (matriz[20] != null) && (matriz[21] != null) && (matriz[22] != null) &&
        		(matriz[23] != null)){
        	
        	Integer valor_3001 = Integer.valueOf(matriz[0].toString());
           	Integer valor_3101 = Integer.valueOf(matriz[1].toString());
           	Integer valor_3201 = Integer.valueOf(matriz[2].toString());
           	Integer valor_3301 = Integer.valueOf(matriz[3].toString());
           	Integer valor_3401 = Integer.valueOf(matriz[4].toString());
           	Integer valor_3501 = Integer.valueOf(matriz[5].toString());
           	Integer valor_3601 = Integer.valueOf(matriz[6].toString());
           	Integer valor_3701 = Integer.valueOf(matriz[7].toString());
           	Integer valor_3801 = Integer.valueOf(matriz[8].toString());
           	Integer valor_3901 = Integer.valueOf(matriz[9].toString());
           	Integer valor_4001 = Integer.valueOf(matriz[10].toString());
           	Integer valor_4101 = Integer.valueOf(matriz[11].toString());
           	Integer valor_4102 = Integer.valueOf(matriz[12].toString());
           	Integer valor_4103 = Integer.valueOf(matriz[13].toString());
           	Integer valor_4201 = Integer.valueOf(matriz[14].toString());
           	Integer valor_4202 = Integer.valueOf(matriz[15].toString());
           	Integer valor_4203 = Integer.valueOf(matriz[16].toString());
           	Integer valor_4204 = Integer.valueOf(matriz[17].toString());
           	Integer valor_4205 = Integer.valueOf(matriz[18].toString());
           	Integer valor_4301 = Integer.valueOf(matriz[19].toString());
           	Integer valor_4401 = Integer.valueOf(matriz[20].toString());
           	Integer valor_4402 = Integer.valueOf(matriz[21].toString());
           	Integer valor_4501 = Integer.valueOf(matriz[22].toString());
           	Integer valor_4502 = Integer.valueOf(matriz[23].toString());

           	if(valor_3001 == 0){
           		seleccion_30 = valor_3001;
           		checkbox_30.setChecked(false);
           	}else if(valor_3001 == 1)
           	{
           		seleccion_30 = valor_3001;
           		checkbox_30.setChecked(true);           		
           	}
           	

           	if(valor_3101 == 0){
           		seleccion_31 = valor_3001;
           		checkbox_31.setChecked(false);
           	}else if(valor_3101 == 1)
           	{
           		seleccion_31 = valor_3001;
           		checkbox_31.setChecked(true);           		
           	}

           	if(valor_3201 == 0){
           		seleccion_32 = valor_3201;
           		checkbox_32.setChecked(false);
           	}else if(valor_3201 == 1)
           	{
           		seleccion_32 = valor_3201;
           		checkbox_32.setChecked(true);           		
           	}


           	if(valor_3301 == 0){
           		seleccion_33 = valor_3301;
           		checkbox_33.setChecked(false);
           	}else if(valor_3301 == 1)
           	{
           		seleccion_33 = valor_3301;
           		checkbox_33.setChecked(true);           		
           	}


           	if(valor_3401 == 0){
           		seleccion_34 = valor_3401;
           		checkbox_34.setChecked(false);
           	}else if(valor_3401 == 1)
           	{
           		seleccion_34 = valor_3401;
           		checkbox_34.setChecked(true);           		
           	}

           	if(valor_3501 == 0){
           		seleccion_35 = valor_3501;
           		checkbox_35.setChecked(false);
           	}else if(valor_3501 == 1)
           	{
           		seleccion_35 = valor_3501;
           		checkbox_35.setChecked(true);           		
           	}

           	if(valor_3601 == 0){
           		seleccion_36 = valor_3601;
           		checkbox_36.setChecked(false);
           	}else if(valor_3001 == 1)
           	{
           		seleccion_36 = valor_3601;
           		checkbox_36.setChecked(true);           		
           	}

           	if(valor_3701 == 0){
           		seleccion_37 = valor_3701;
           		checkbox_37.setChecked(false);
           	}else if(valor_3701 == 1)
           	{
           		seleccion_37 = valor_3701;
           		checkbox_37.setChecked(true);           		
           	}

           	if(valor_3801 == 0){
           		seleccion_38 = valor_3801;
           		checkbox_38.setChecked(false);
           	}else if(valor_3001 == 1)
           	{
           		seleccion_38 = valor_3801;
           		checkbox_38.setChecked(true);           		
           	}

           	if(valor_3901 == 0){
           		seleccion_39 = valor_3901;
           		checkbox_39.setChecked(false);
           	}else if(valor_3901 == 1)
           	{
           		seleccion_39 = valor_3901;
           		checkbox_39.setChecked(true);           		
           	}

           	if(valor_4001 == 0){
           		seleccion_40 = valor_4001;
           		checkbox_40.setChecked(false);
           	}else if(valor_3001 == 1)
           	{
           		seleccion_40 = valor_4001;
           		checkbox_40.setChecked(true);           		
           	}

           	if(valor_4101 == 0){
           		seleccion_41_01 = valor_4101;
           		checkbox_41_01.setChecked(false);
           	}else if(valor_4101 == 1)
           	{
           		seleccion_41_01 = valor_4101;
           		checkbox_41_01.setChecked(true);           		
           	}
           	if(valor_4102 == 0){
           		seleccion_41_02 = valor_4102;
           		checkbox_41_02.setChecked(false);
           	}else if(valor_4101 == 1)
           	{
           		seleccion_41_02 = valor_4102;
           		checkbox_41_02.setChecked(true);           		
           	}
           	if(valor_4103 == 0){
           		seleccion_41_03 = valor_4103;
           		checkbox_41_03.setChecked(false);
           	}else if(valor_4103 == 1)
           	{
           		seleccion_41_03 = valor_4103;
           		checkbox_41_03.setChecked(true);           		
           	}
           	
           	if(valor_4201 == 0){
           		seleccion_42_01 = valor_4201;
           		checkbox_42_01.setChecked(false);
           	}else if(valor_4201 == 1)
           	{
           		seleccion_42_01 = valor_4201;
           		checkbox_42_01.setChecked(true);           		
           	}
         	if(valor_4202 == 0){
           		seleccion_42_02 = valor_4202;
           		checkbox_42_02.setChecked(false);
           	}else if(valor_4202 == 1)
           	{
           		seleccion_42_02 = valor_4202;
           		checkbox_42_02.setChecked(true);           		
           	}
         	if(valor_4203 == 0){
           		seleccion_42_03 = valor_4203;
           		checkbox_42_03.setChecked(false);
           	}else if(valor_4203 == 1)
           	{
           		seleccion_42_03 = valor_4203;
           		checkbox_42_03.setChecked(true);           		
           	}
         	if(valor_4204 == 0){
           		seleccion_42_04 = valor_4204;
           		checkbox_42_04.setChecked(false);
           	}else if(valor_4204 == 1)
           	{
           		seleccion_42_04 = valor_4204;
           		checkbox_42_04.setChecked(true);           		
           	}
         	if(valor_4205 == 0){
           		seleccion_42_05 = valor_4205;
           		checkbox_42_05.setChecked(false);
           	}else if(valor_4205 == 1)
           	{
           		seleccion_42_05 = valor_4205;
           		checkbox_42_05.setChecked(true);           		
           	}
         	if(valor_4301 == 0){
           		seleccion_43 = valor_4301;
           		checkbox_43.setChecked(false);
           	}else if(valor_4301 == 1)
           	{
           		seleccion_43 = valor_4301;
           		checkbox_43.setChecked(true);           		
           	}
         	if(valor_4401 == 0){
           		seleccion_44_01 = valor_4401;
           		checkbox_44_01.setChecked(false);
           	}else if(valor_4401 == 1)
           	{
           		seleccion_44_01 = valor_4401;
           		checkbox_44_01.setChecked(true);           		
           	}
         	if(valor_4402 == 0){
           		seleccion_44_02 = valor_4402;
           		checkbox_44_02.setChecked(false);
           	}else if(valor_4402 == 1)
           	{
           		seleccion_44_01 = valor_4402;
           		checkbox_44_01.setChecked(true);           		
           	}
         	if(valor_4501 == 0){
           		seleccion_45_01 = valor_4501;
           		checkbox_45_01.setChecked(false);
           	}else if(valor_4501 == 1)
           	{
           		seleccion_45_01 = valor_4501;
           		checkbox_45_01.setChecked(true);           		
           	}
         	if(valor_4502 == 0){
           		seleccion_45_02 = valor_4502;
           		checkbox_45_02.setChecked(false);
           	}else if(valor_4502 == 1)
           	{
           		seleccion_45_02 = valor_4502;
           		checkbox_45_02.setChecked(true);           		
           	}
         	
        }
        
        btn_siguiente_mini_primero.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				 miniMentalSiguientePrimero(view);
			}
		});
	    btn_abortar_mini_primero.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				miniMentalAbortarPrimero(view);
			}
		});
	}

    public void miniMentalSiguientePrimero(View view)
    {
        Intent minisiguiente = new Intent(this,CuestionarioMiniMentalSegundo.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", p_3001";
        String comando_02 = ", t_3001";
        String comando_03  = ", p_3101";
        String comando_04 = ", t_3101";
        String comando_05  = ", p_3201";
        String comando_06 = ", t_3201";
        String comando_07  = ", p_3301";
        String comando_08 = ", t_3301";
        String comando_09  = ", p_3401";
        String comando_10 = ", t_3401";
        String comando_11  = ", p_3501";
        String comando_12 = ", t_3501";
        String comando_13  = ", p_3601";
        String comando_14 = ", t_3601";
        String comando_15 = ", p_3701";
        String comando_16 = ", t_3701";
        String comando_17 = ", p_3801";
        String comando_18 = ", t_3801";
        String comando_19 = ", p_3901";
        String comando_20 = ", t_3901";
        String comando_21 = ", p_4001";
        String comando_22 = ", t_4001";
        String comando_23 = ", p_4101";
        String comando_24 = ", t_4101";
        String comando_25 = ", p_4102";
        String comando_26 = ", t_4102";
        String comando_27 = ", p_4103";
        String comando_28 = ", t_4103";
        String comando_29  = ", p_4201";
        String comando_30 = ", t_4201";
        String comando_31  = ", p_4202";
        String comando_32 = ", t_4202";
        String comando_33  = ", p_4203";
        String comando_34 = ", t_4203";
        String comando_35  = ", p_4204";
        String comando_36 = ", t_4204";
        String comando_37  = ", p_4205";
        String comando_38 = ", t_4205";
        String comando_39  = ", p_43";
        String comando_40 = ", t_43";
        String comando_41  = ", p_4401";
        String comando_42 = ", t_4401";
        String comando_43 = ", p_4402";
        String comando_44 = ", t_4402";
        String comando_45 = ", p_4403";
        String comando_46 = ", t_4403";
        String comando_47 = ", p_4501";
        String comando_48 = ", t_4501";
        String comando_49 = ", p_4502";
        String comando_51 = ", t_4502";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0204(comando_00,
                comando_01, seleccion_30,
                comando_02, tiempo_30,
                comando_03, seleccion_31,
                comando_04, tiempo_31,
                comando_05, seleccion_32,
                comando_06, tiempo_32,
                comando_07, seleccion_33,
                comando_08, tiempo_33,
                comando_09, seleccion_34,
                comando_10, tiempo_34,
                comando_11, seleccion_35,
                comando_12, tiempo_35,
                comando_13, seleccion_36,
                comando_14, tiempo_36,
                comando_15, seleccion_37,
                comando_16, tiempo_37,
                comando_17, seleccion_38,
                comando_18, tiempo_38,
                comando_19, seleccion_39,
                comando_20, tiempo_39,
                comando_21, seleccion_40,
                comando_22, tiempo_40,
                comando_23, seleccion_41_01,
                comando_24,tiempo_41_01,
                comando_25, seleccion_41_02,
                comando_26, tiempo_41_02,
                comando_27,seleccion_41_03,
                comando_28,tiempo_41_03,
                comando_29, seleccion_42_01,
                comando_30,tiempo_42_01,
                comando_31, seleccion_42_02,
                comando_32, tiempo_42_02,
                comando_33,seleccion_42_03,
                comando_34,tiempo_42_03,
                comando_35, seleccion_42_04,
                comando_36,tiempo_42_04,
                comando_37, seleccion_42_05,
                comando_38, tiempo_42_05,
                comando_39, seleccion_43,
                comando_40, tiempo_43,
                comando_41, seleccion_44_01,
                comando_42,tiempo_44_01,
                comando_43, seleccion_44_02,
                comando_44, tiempo_44_02,
                comando_45,seleccion_44_03,
                comando_46,tiempo_44_03,
                comando_47, seleccion_45_01,
                comando_48,tiempo_45_01,
                comando_49, seleccion_45_02,
                comando_51, tiempo_45_02,
                comando_50);
        startActivity(minisiguiente);
    }
    
    public void miniMentalAbortarPrimero(View view)
    {
        Intent miniAbortar = new Intent(this,MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", p_3001";
        String comando_02 = ", t_3001";
        String comando_03  = ", p_3101";
        String comando_04 = ", t_3101";
        String comando_05  = ", p_3201";
        String comando_06 = ", t_3201";
        String comando_07  = ", p_3301";
        String comando_08 = ", t_3301";
        String comando_09  = ", p_3401";
        String comando_10 = ", t_3401";
        String comando_11  = ", p_3501";
        String comando_12 = ", t_3501";
        String comando_13  = ", p_3601";
        String comando_14 = ", t_3601";
        String comando_15 = ", p_3701";
        String comando_16 = ", t_3701";
        String comando_17 = ", p_3801";
        String comando_18 = ", t_3801";
        String comando_19 = ", p_3901";
        String comando_20 = ", t_3901";
        String comando_21 = ", p_4001";
        String comando_22 = ", t_4001";
        String comando_23 = ", p_4101";
        String comando_24 = ", t_4101";
        String comando_25 = ", p_4102";
        String comando_26 = ", t_4102";
        String comando_27 = ", p_4103";
        String comando_28 = ", t_4103";
        String comando_29  = ", p_4201";
        String comando_30 = ", t_4201";
        String comando_31  = ", p_4202";
        String comando_32 = ", t_4202";
        String comando_33  = ", p_4203";
        String comando_34 = ", t_4203";
        String comando_35  = ", p_4204";
        String comando_36 = ", t_4204";
        String comando_37  = ", p_4205";
        String comando_38 = ", t_4205";
        String comando_39  = ", p_43";
        String comando_40 = ", t_43";
        String comando_41  = ", p_4401";
        String comando_42 = ", t_4401";
        String comando_43 = ", p_4402";
        String comando_44 = ", t_4402";
        String comando_45 = ", p_4403";
        String comando_46 = ", t_4403";
        String comando_47 = ", p_4501";
        String comando_48 = ", t_4501";
        String comando_49 = ", p_4502";
        String comando_51 = ", t_4502";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0204(comando_00,
        		 comando_01, seleccion_30,
                 comando_02, tiempo_30,
                 comando_03, seleccion_31,
                 comando_04, tiempo_31,
                 comando_05, seleccion_32,
                 comando_06, tiempo_32,
                 comando_07, seleccion_33,
                 comando_08, tiempo_33,
                 comando_09, seleccion_34,
                 comando_10, tiempo_34,
                 comando_11, seleccion_35,
                 comando_12, tiempo_35,
                 comando_13, seleccion_36,
                 comando_14, tiempo_36,
                 comando_15, seleccion_37,
                 comando_16, tiempo_37,
                 comando_17, seleccion_38,
                 comando_18, tiempo_38,
                 comando_19, seleccion_39,
                 comando_20, tiempo_39,
                 comando_21, seleccion_40,
                 comando_22, tiempo_40,
                 comando_23, seleccion_41_01,
                 comando_24,tiempo_41_01,
                 comando_25, seleccion_41_02,
                 comando_26, tiempo_41_02,
                 comando_27,seleccion_41_03,
                 comando_28,tiempo_41_03,
                 comando_29, seleccion_42_01,
                 comando_30,tiempo_42_01,
                 comando_31, seleccion_42_02,
                 comando_32, tiempo_42_02,
                 comando_33,seleccion_42_03,
                 comando_34,tiempo_42_03,
                 comando_35, seleccion_42_04,
                 comando_36,tiempo_42_04,
                 comando_37, seleccion_42_05,
                 comando_38, tiempo_42_05,
                 comando_39, seleccion_43,
                 comando_40, tiempo_43,
                 comando_41, seleccion_44_01,
                 comando_42,tiempo_44_01,
                 comando_43, seleccion_44_02,
                 comando_44, tiempo_44_02,
                 comando_45,seleccion_44_03,
                 comando_46,tiempo_44_03,
                 comando_47, seleccion_45_01,
                 comando_48,tiempo_45_01,
                 comando_49, seleccion_45_02,
                 comando_51, tiempo_45_02,
                comando_50);
        startActivity(miniAbortar);
    }
	
	 public String me_das_tu_ora() {
	        Date date = new Date();
	        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
	        return cadena_la_hora;
	    }
}