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
public class CuestionarioMiniMentalSegundo extends Activity{
	
  //  CheckBox Pregunta46,Pregunta47R1,Pregunta47R2,Pregunta47R3;
  //  CheckBox  Pregunta48,Pregunta49,Pregunta50;
    private CheckBox checkbox_46;
    private int seleccion_46 = 0;
    private String tiempo_46; 
    private CheckBox checkbox_47_01;
    private int seleccion_47_01 = 0;
    private String tiempo_47_01; 
    private CheckBox checkbox_47_02;
    private int seleccion_47_02 = 0;
    private String tiempo_47_02; 
    private CheckBox checkbox_47_03;
    private int seleccion_47_03 = 0;
    private String tiempo_47_03; 
    private CheckBox checkbox_48;
    private int seleccion_48 = 0;
    private String tiempo_48; 
    private CheckBox checkbox_49;
    private int seleccion_49 = 0;
    private String tiempo_49;
    private CheckBox checkbox_50;
    private int seleccion_50 = 0;
    private String tiempo_50; 
    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private String el_registro;
    private static String la_tableta;
    private static String el_encuesto;
  
    private Button btn_finalizar;
    private Button btn_abortar_mini_segundo;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_mental_segundo);
		
		Date date = new Date();
   //     seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
     //   seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";
		
        	checkbox_46 = (CheckBox)findViewById(R.id.checkBox46);
        	checkbox_47_01 = (CheckBox)findViewById(R.id.checkBox47_opcion_01);
        	checkbox_47_02 = (CheckBox)findViewById(R.id.checkBox47_opcion_02);
        	checkbox_47_03 = (CheckBox)findViewById(R.id.checkBox47_opcion_03);
        	checkbox_48 = (CheckBox)findViewById(R.id.checkBox48);
        	checkbox_49 = (CheckBox)findViewById(R.id.checkBox49);
        	checkbox_50 = (CheckBox)findViewById(R.id.checkBox50);
	        
        	btn_finalizar =  (Button)findViewById(R.id.btn_finalizar);
            btn_abortar_mini_segundo =  (Button)findViewById(R.id.btn_abortar_mini_segundo);
	        
	        if (checkbox_46.isChecked())
	        {
	            seleccion_46 = 1;
	            tiempo_46 = me_das_tu_ora();
	        }else if (!checkbox_46.isChecked())
	        {
	            seleccion_46 = 0;
	            tiempo_46 = me_das_tu_ora();
	        }

	        if (checkbox_47_01.isChecked())
	        {
	            seleccion_47_01 = 1;
	            tiempo_47_01 = me_das_tu_ora();
	        }else if (!checkbox_47_01.isChecked())
	        {
	            seleccion_47_01 = 0;
	            tiempo_47_01 = me_das_tu_ora();
	        }

	        if (checkbox_47_02.isChecked())
	        {
	            seleccion_47_02 = 1;
	            tiempo_47_02 = me_das_tu_ora();
	        }else if (!checkbox_47_02.isChecked())
	        {
	            seleccion_47_02 = 0;
	            tiempo_47_02 = me_das_tu_ora();
	        }

	        if (checkbox_47_03.isChecked())
	        {
	            seleccion_47_03 = 1;
	            tiempo_47_03 = me_das_tu_ora();
	        }else if (!checkbox_47_03.isChecked())
	        {
	            seleccion_47_03 = 0;
	            tiempo_47_03 = me_das_tu_ora();
	        }

	        if (checkbox_48.isChecked())
	        {
	            seleccion_48 = 1;
	            tiempo_48 = me_das_tu_ora();
	        }else if (!checkbox_48.isChecked())
	        {
	            seleccion_48 = 0;
	            tiempo_48 = me_das_tu_ora();
	        }
	        if (checkbox_49.isChecked())
	        {
	            seleccion_49 = 1;
	            tiempo_49 = me_das_tu_ora();
	        }else if (!checkbox_49.isChecked())
	        {
	            seleccion_49 = 0;
	            tiempo_49 = me_das_tu_ora();
	        }
	        if (checkbox_50.isChecked())
	        {
	            seleccion_50 = 1;
	            tiempo_50 = me_das_tu_ora();
	        }else if (!checkbox_50.isChecked())
	        {
	            seleccion_50 = 0;
	            tiempo_50 = me_das_tu_ora();
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

	        String comando_1 = "SELECT p_4601, " +
	                "p_4701, p_4702, p_4703, p_4801, p_4901, " +
	                "p_5001 " +
	                "FROM cuestionariobasico " +
	                "WHERE registro = " + "'" + el_registro + "'";

	        final String matriz[] = fuenteCuestionarioBasico.abrirCaptura_0207(comando_1);
	        fuenteCuestionarioBasico.close();
     if((matriz[0] != null)&& (matriz[1] != null)&&(matriz[2] != null)&&(matriz[3] != null)&&
     		(matriz[4] != null)&& (matriz[5] != null)&& (matriz[6] != null))
     {
    	 	Integer valor_4601 = Integer.valueOf(matriz[0].toString());
        	Integer valor_4701 = Integer.valueOf(matriz[1].toString());
        	Integer valor_4702 = Integer.valueOf(matriz[2].toString());
        	Integer valor_4703 = Integer.valueOf(matriz[3].toString());
        	Integer valor_4801 = Integer.valueOf(matriz[4].toString());
        	Integer valor_4901 = Integer.valueOf(matriz[5].toString());
        	Integer valor_5001 = Integer.valueOf(matriz[6].toString());

        	if(valor_4601 == 0){
           		seleccion_46 = valor_4601;
           		checkbox_46.setChecked(false);
           	}else if(valor_4601 == 1)
           	{
           		seleccion_46 = valor_4601;
           		checkbox_46.setChecked(true);           		
           	}
        	
        	if(valor_4701 == 0){
           		seleccion_47_01 = valor_4701;
           		checkbox_47_01.setChecked(false);
           	}else if(valor_4701 == 1)
           	{
           		seleccion_47_01 = valor_4701;
           		checkbox_47_01.setChecked(true);           		
           	}
        	if(valor_4702 == 0){
           		seleccion_47_02 = valor_4702;
           		checkbox_47_02.setChecked(false);
           	}else if(valor_4702 == 1)
           	{
           		seleccion_47_02 = valor_4702;
           		checkbox_47_02.setChecked(true);           		
           	}
        	if(valor_4703 == 0){
           		seleccion_47_03 = valor_4703;
           		checkbox_47_03.setChecked(false);
           	}else if(valor_4703 == 1)
           	{
           		seleccion_47_03 = valor_4703;
           		checkbox_47_03.setChecked(true);           		
           	}
        	
        	if(valor_4801 == 0){
           		seleccion_48 = valor_4801;
           		checkbox_48.setChecked(false);
           	}else if(valor_4801 == 1)
           	{
           		seleccion_48 = valor_4801;
           		checkbox_48.setChecked(true);           		
           	}
        	if(valor_4901 == 0){
           		seleccion_49 = valor_4901;
           		checkbox_49.setChecked(false);
           	}else if(valor_4901 == 1)
           	{
           		seleccion_49 = valor_4901;
           		checkbox_49.setChecked(true);           		
           	}
        	if(valor_5001 == 0){
           		seleccion_50 = valor_5001;
           		checkbox_50.setChecked(false);
           	}else if(valor_5001 == 1)
           	{
           		seleccion_50 = valor_5001;
           		checkbox_50.setChecked(true);           		
           	}
     }
     
     btn_finalizar.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View view) {
			// TODO Auto-generated method stub
			miniMentalFinalizar(view);
		}
	});
     btn_abortar_mini_segundo.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View view) {
			// TODO Auto-generated method stub
			miniMentalAbortarSegundo(view);
		}
	});
     
}
	
	public void miniMentalFinalizar(View view)
    {
		Intent miniFinalizar = new Intent(this,CuestionarioTerminacion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = ", p_4601";
        String comando_02 = ", t_4601";
        String comando_03 = "p_4701";
        String comando_04 = "t_4701";
        String comando_05 = "p_4702";
        String comando_06 = "t_4702";
        String comando_07 = "p_4703";
        String comando_08 = "t_4703";
        String comando_09 = ", p_4801";
        String comando_10 = ", t_4801";
        String comando_11 = ", p_4901";
        String comando_12 = ", t_4901";
        String comando_13 = ", p_5001";
        String comando_14 = ", t_5001";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        
        fuenteCuestionarioBasico.guardarCaptura_0207(comando_00,
                comando_01, seleccion_46,
                comando_02, tiempo_46,
                comando_03, seleccion_47_01,
                comando_04, tiempo_47_01,
                comando_05, seleccion_47_02,
                comando_06, tiempo_47_02,
                comando_07, seleccion_47_03,
                comando_08, tiempo_47_03,
                comando_09, seleccion_48,
                comando_10, tiempo_48,
                comando_11, seleccion_49,
                comando_12, tiempo_49,
                comando_13, seleccion_50,
                comando_14, tiempo_50,
                comando_50);
        startActivity(miniFinalizar);
    }
	
	public void miniMentalAbortarSegundo(View view)
    {
		Intent miniFinalizarAbortar = new Intent(this,CuestionarioTerminacion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = ", p_4601";
        String comando_02 = ", t_4601";
        String comando_03 = "p_4701";
        String comando_04 = "t_4701";
        String comando_05 = "p_4702";
        String comando_06 = "t_4702";
        String comando_07 = "p_4703";
        String comando_08 = "t_4703";
        String comando_09 = ", p_4801";
        String comando_10 = ", t_4801";
        String comando_11 = ", p_4901";
        String comando_12 = ", t_4901";
        String comando_13 = ", p_5001";
        String comando_14 = ", t_5001";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        
        fuenteCuestionarioBasico.guardarCaptura_0207(comando_00,
        		 comando_01, seleccion_46,
                 comando_02, tiempo_46,
                 comando_03, seleccion_47_01,
                 comando_04, tiempo_47_01,
                 comando_05, seleccion_47_02,
                 comando_06, tiempo_47_02,
                 comando_07, seleccion_47_03,
                 comando_08, tiempo_47_03,
                 comando_09, seleccion_48,
                 comando_10, tiempo_48,
                 comando_11, seleccion_49,
                 comando_12, tiempo_49,
                 comando_13, seleccion_50,
                 comando_14, tiempo_50,
                comando_50);
        startActivity(miniFinalizarAbortar);
    }
	
    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}