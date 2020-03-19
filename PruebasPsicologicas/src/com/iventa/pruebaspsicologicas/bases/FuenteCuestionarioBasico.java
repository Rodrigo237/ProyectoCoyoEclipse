package com.iventa.pruebaspsicologicas.bases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.iventa.pruebaspsicologicas.clases.ClasesIndividual;

@SuppressLint("SimpleDateFormat")
public class FuenteCuestionarioBasico { 
    private SQLiteDatabase db; 
    private SQLiteOpenHelperBasico dbHelper; 

    Date date = new Date();
    String seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";

    public FuenteCuestionarioBasico(Context context) { 
        dbHelper = new SQLiteOpenHelperBasico(context); 
    } 
  
    public void open() { 
        db = dbHelper.getWritableDatabase();
    } 
  
    public void close() { 
        dbHelper.close(); 
    } 

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaHombresPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(sexo) FROM cuestionariobasico WHERE sexo = 1 AND p_0815 > 0 AND p_0815 < 8", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(sexo)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaMujeresPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(sexo) FROM cuestionariobasico WHERE sexo = 2 AND p_0815 > 0 AND p_0815 < 8", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(sexo)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaSangrePeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0811) FROM cuestionariobasico WHERE p_0811 LIKE 'MRS%'", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0811)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaPipiPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_081402) FROM cuestionariobasico WHERE p_081402 LIKE 'MRSP%'", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_081402)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-09
    public Integer cuentaCambioDeDomicilioPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 6", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaMortalidadPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 7", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-09
    public Integer cuentaNoEnDomicilioPeriodoEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 11", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaHombresHoyEnBasico() {
	    Cursor cursor = db.rawQuery("SELECT count(sexo) FROM cuestionariobasico WHERE sexo = 1 AND p_0815 > 0 AND p_0815 < 8 AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(sexo)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaMujeresHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(sexo) FROM cuestionariobasico WHERE sexo = 2 AND p_0815 > 0 AND p_0815 < 8 AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(sexo)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaSangreHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0811) FROM cuestionariobasico WHERE p_0811 LIKE 'MRS%' AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0811)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaPipiHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_081402) FROM cuestionariobasico WHERE p_081402 LIKE 'MRSP%' AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_081402)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-09
    public Integer cuentaCambioDeDomicilioHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 6 AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-02
    public Integer cuentaMortalidadHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 7 AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2017-12-09
    public Integer cuentaNoEnDomicilioHoyEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(p_0815) FROM cuestionariobasico WHERE p_0815 = 11 AND fecha = " + seleccion_fecha, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(p_0815)"));
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2014-07-31
    public Integer cuentaRegistrosEnBasico() {
    	Cursor cursor = db.rawQuery("SELECT count(*) FROM cuestionariobasico", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
    	cursor.close(); 
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2014-07-31
    public Integer cuentaRegistrosEnAreaEnBasico(String comando_SQL) {
    	Cursor cursor = db.rawQuery(comando_SQL, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
    	cursor.close(); 
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2014-07-31
    public Integer cuentaRegistrosEnManzanaEnBasico(String comando_SQL) {
    	Cursor cursor = db.rawQuery(comando_SQL, null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
    	cursor.close(); 
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2015-05-05
    public Integer cuentaRegistrosEnPosicionador() {
    	Cursor cursor = db.rawQuery("SELECT count(*) FROM posicionador", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
    	cursor.close(); 
    	return cantidad_de_registros;
    }

    // TabletaAdministrador = 2019-12-30
    public Integer cuentaRegistrosEnMorbilidad() {
    	Cursor cursor = db.rawQuery("SELECT count(*) FROM cuestionariobasico", null);
    	cursor.moveToFirst();
		Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
    	cursor.close(); 
    	return cantidad_de_registros;
    }

	// TabletaPantalla0815 = 2018-03-03
//    public void guardarCaptura_Referencia(String comando_SQL) { 
//        Cursor cursor = db.rawQuery(comando_SQL, null); 
//        cursor.close(); 
//    } 

    public void guardarCaptura_Referencia(String comando_SQL) { 
//    	db.execSQL(comando_SQL);
    	db.execSQL("CREATE TABLE '/storage/sdcard0/morbilidad/cacapedochis.s3db' AS SELECT * FROM cuestionariobasico WHERE registro = '2E10NLZ77'");
	db.close();
    } 

    // TabletaAdministrador = 2015-05-06
    public void crearRegistroPosicionador(String la_tableta, String el_encuesto) {
    	db.execSQL("INSERT INTO posicionador (tableta,encuesto) " +
    				"VALUES ('" + la_tableta + "','" + el_encuesto +"')"
				);
    	db.close();
    }

    // TabletaBuscarProspecto = 2014-07-09
    // TabletaBuscarProspecto = 2017-03-03
    public void crearCuestionarioBasico(Integer el_campoSecuencia, String el_campoRegistro, 
    		String el_campoCadena, Integer el_campoMunicipio,
    		Integer el_campoAgeb, Integer  el_campoArea, Integer el_campoManzana, Integer el_campoVivienda,
			String el_campoNombre, String el_campoPaterno, String el_campoMaterno,
			Integer el_campoSexo, Integer el_campoEdad, Integer el_campoEdadActual,
			String el_campoP72,
			String la_tableta, Integer el_resultado, String la_version) {
    	db.execSQL("INSERT INTO cuestionariobasico " +
    						"(secuencia,registro,cadena," +
    						"municipio,ageb,area,manzana,vivienda," +
    						"nombre,paterno,materno," +
    						"sexo,edad,edad_hoy," +
    						"p72," +
    						"tableta,p_0815,version) " +
			"VALUES (" +
				el_campoSecuencia + ",'" + el_campoRegistro + "','" + el_campoCadena + "'," +
				el_campoMunicipio + "," + el_campoAgeb + "," + el_campoArea + "," + el_campoManzana + "," + el_campoVivienda + ",'" +
				el_campoNombre + "','" + el_campoPaterno + "','" + el_campoMaterno + "'," +
				el_campoSexo + "," + el_campoEdad + "," + el_campoEdadActual + ",'" + 
				el_campoP72 + "','" +
				la_tableta + "'," + el_resultado + ",'" + la_version + "')"
				);
    }

//	la_tableta + "'," + el_resultado + ")"


    // TabletaAdministrador = 2015-11-03
    public void vaciarCuestionarioBasico() {
    	db.execSQL("DELETE FROM cuestionariobasico");
//      db.execSQL("delete table if exists cuestionariobasico"); 
//      db.execSQL("drop table if exists cuestionariobasico");
//      db.execSQL("create table cuestionariobasico");
      db.close();
    }

    //  TabletaPantalla0100 = 2019-04-20
    public void checarRegistroPosicionador() {
    	Cursor cursor = db.rawQuery("SELECT registro FROM posicionador", null);
    	Integer renglones = cursor.getCount();

    	if (renglones == 0) {
        	db.execSQL("INSERT INTO posicionador (registro) VALUES (null)");
    	}

    	db.close();
    }

    // TabletaBuscarSujeto = 2014-07-09
    public void fijarRegistroPosicionador(String el_campoRegistro) {
    	Cursor cursor = db.rawQuery("SELECT registro FROM posicionador", null);
    	Integer renglones = cursor.getCount();

    	if (renglones == 0) {
        	db.execSQL("INSERT INTO posicionador (registro) VALUES (null)");
    	}

    	db.execSQL("UPDATE posicionador SET registro = " + "'" + el_campoRegistro + "'");
    }

    // TabletaBuscarCuestionario = 2014-11-14
    public String[] buscaMatriz(String comando_SQL, String elrenglon) { 
//    	Cursor cursor = db.rawQuery("SELECT registro, cadena, municipio, ageb, area, manzana, vivienda, nombre, paterno, materno, sexo, edad, p72, vive FROM cuestionariobasico WHERE " + buscar, null);
    	Cursor cursor = db.rawQuery(comando_SQL, null);

    	Integer posicion = Integer.valueOf(elrenglon);
    	cursor.moveToPosition(posicion);

    	String[] lamatriz = {
    			cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),
    			cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),
    			cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),
    			cursor.getString(12),cursor.getString(13)
    			};

    	cursor.close(); 
    	return lamatriz;
    }

//    public String[] buscaUnaMatriz(String buscar) { 
//    	Cursor cursor = db.rawQuery("SELECT registro, cadena, municipio, ageb, area, manzana, vivienda, nombre, paterno, materno, sexo, edad, p72, vive FROM cuestionariobasico WHERE " + buscar, null);
//      	cursor.moveToFirst();
//
//    	String[] lamatriz = {
//    			cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),
//    			cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),
//    			cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),
//    			cursor.getString(12),cursor.getString(13)
//    			};
//
//    	cursor.close(); 
//    	return lamatriz;
//    }

    // TabletaBuscarCuestionario = 2014-07-09
    public List<ClasesIndividual> buscaVariosRegistros(String comando_SQL) { 
        List<ClasesIndividual> listaDeBasico = new ArrayList<ClasesIndividual>(); 
        Cursor cursor = db.rawQuery(comando_SQL, null); 
        cursor.moveToFirst(); 

        while (!cursor.isAfterLast()) { 
        	ClasesIndividual nuevoRegistro = cursorToBasico(cursor); 
        	listaDeBasico.add(nuevoRegistro);
            cursor.moveToNext(); 
        } 

        cursor.close(); 
        return listaDeBasico; 
    } 

    // TabletaBuscarCuestionario = 2014-07-09
    // TabletaBuscarCuestionario = 2017-03-04
    private ClasesIndividual cursorToBasico(Cursor cursor) { 
    	ClasesIndividual registro = new ClasesIndividual();
    	registro.setId(cursor.getLong(0)); 

    	String el_sexo = "Nada";
    	String resultado = null;

		if (cursor.getString(14) == null) resultado = "No hay nada";

		if (cursor.getString(14) != null) {
			switch (Integer.valueOf(cursor.getString(14))) {
				case 1:
					resultado = "La persona en la puerta se negó a dar información.";
					break;
				case 2:
					resultado = "Entrevista completa respondida por el reclutado vivo.";
					break;
				case 3:
					resultado = "...";
					break;
				case 4:
					resultado = "Entrevista completa respondida por un familiar del reclutado vivo.";
					break;
				case 5:
					resultado = "...";
					break;
				case 6:
					resultado = "El reclutado cambió de domicilio.";
					break;
				case 7:
					resultado = "El reclutado falleció.";
					break;
				case 8:
					resultado = "Entrevista incompleta.";
					break;
				case 9:
					resultado = "No es la persona correcta.";
					break;
				case 10:
					resultado = "No es la dirección correcta.";
					break;
				case 11:
					resultado = "El reclutado vive, no está en su domicilio y no responden en su nombre. AUSENTE.";
					break;
				case 12:
					resultado = "El reclutado no puede responder por padecer de sus facultades mentales.";
					break;
				case 13:
					resultado = "No se pudo verificar a la persona.";
					break;
				case 14:
					resultado = "No se pudo verificar el domicilio.";
					break;
				case 15:
					resultado = "Nadie en casa.";
					break;
				case 16:
					resultado = "La casa ya no existe.";
					break;
				case 17:
					resultado = "Entrevista respondida por el reclutado pero sin preguntas de salud. RENUENTE.";
					break;
				case 18:
					resultado = "...";
					break;
				case 19:
					resultado = "Entrevista iniciada.";
					break;
				case 20:
					resultado = "Entrevista no iniciada.";
					break;
			} // Final de switch
		} // Final de if (valor_0815 > 0)

		if (cursor.getString(15) != null) {
			if (Integer.valueOf(cursor.getString(15)) > 999) resultado = resultado + " Entrevista ABORTADA.";
		}

		resultado = "Resultado = " + resultado;

		if (Integer.valueOf(cursor.getString(10)) == 1) el_sexo = "Masculino";
    	if (Integer.valueOf(cursor.getString(10)) == 2) el_sexo = "Femenino";

    	String texto = cursor.getString(0) + ", " +
    						cursor.getString(2) + "-" + cursor.getString(3) + "-" + cursor.getString(4) + "-" +
    						cursor.getString(5) + "-" + cursor.getString(6) + ", " +
    						cursor.getString(7) + " " + cursor.getString(8) + " " + cursor.getString(9) + ", " +
							el_sexo + ", Edad ayer " + cursor.getString(11) + ", Edad actual " + cursor.getString(12) + ", " +
    						cursor.getString(13) + ", " + resultado;

    	registro.setTexto(texto); 
        return registro; 
    } // Final de cursorToBasico

    // TabletaMostrarCuestionario = 2016-04-17
    public List<ClasesIndividual> buscaMuchosRegistros(String comando_SQL) { 
        List<ClasesIndividual> listaDeBasico = new ArrayList<ClasesIndividual>(); 
        Cursor cursor = db.rawQuery(comando_SQL, null); 
        cursor.moveToFirst(); 

        while (!cursor.isAfterLast()) { 
        	ClasesIndividual nuevoRegistro = cursorHaciaBasico(cursor); 
        	listaDeBasico.add(nuevoRegistro);
            cursor.moveToNext(); 
        } 

        cursor.close();
        return listaDeBasico; 
    } 

    // TabletaMostrarCuestionario = 2016-04-17
    private ClasesIndividual cursorHaciaBasico(Cursor cursor) { 
    	ClasesIndividual registro = new ClasesIndividual();
    	registro.setId(cursor.getLong(0)); 
    	registro.setTexto(cursor.getString(0) + ", " + cursor.getString(1) + ", " + cursor.getString(2) + ", " +
							cursor.getString(3) + ", " + cursor.getString(4) + ", " + cursor.getString(5) + ", " +
							cursor.getString(6) + ", " + cursor.getString(7) + " " + cursor.getString(8) + " " +
							cursor.getString(9)
							); 
        return registro; 
    }

//==========================================================================================================
// Inicia órden por pantallas

    // TabletaBuscarEncuestadora = 2015-05-13
    public void guardarEncuestadora(String comando_00,
									String comando_01, String el_nombre_de_tableta,
									String comando_02, String el_nombre_de_encuestadora,
									String comando_03, Integer la_foto_de_encuestadora
    								) {
    	db.execSQL(comando_00 +
    				comando_01 + el_nombre_de_tableta +
    				comando_02 + el_nombre_de_encuestadora +
    				comando_03 + la_foto_de_encuestadora
    				);

    	db.close(); 
    }

    // TabletaBuscarProspecto = 2015-07-16
    public String buscarExistente(String comando_00) {
    	Cursor cursor = db.rawQuery(comando_00, null);
      	cursor.moveToFirst();
    	String el_prospecto = null;

      	if (cursor.getCount() == 0) {
      		el_prospecto = "No está";
      	}

      	if (cursor.getCount() > 0) {
      		el_prospecto = "Sí está";
      	}

      	cursor.close();
		return el_prospecto;
    }

    // Todas las pantallas = 2014-07-09
    public String[] tomarRegistro(String comando_00) {
    	Cursor cursor = db.rawQuery(comando_00, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaBuscarProspecto = 2015-05-05
    public String[] tomarTableta(String comando_00) {
    	Cursor cursor = db.rawQuery(comando_00, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaPantalla0101 = 2015-05-05
    public String[] tomarEncuesto(String comando_00) {
    	Cursor cursor = db.rawQuery(comando_00, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // Todas las pantallas = 2014-07-07
    public String[] tomarNombre(String comando_0) {
    	Cursor cursor = db.rawQuery(comando_0, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaPantalla0310 = 2019-08-24
    public String[] tomarNombreConEdad(String comando_0) {
    	Cursor cursor = db.rawQuery(comando_0, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaPantalla0407 = 2019-09-25
    public String[] tomarNombreConSexo(String comando_0) {
    	Cursor cursor = db.rawQuery(comando_0, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaPantalla0100 = 2015-06-19
    public String[] tomarImagen(String comando_0) {
    	Cursor cursor = db.rawQuery(comando_0, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaBuscarCuestionario = 2014-11-12
    public String[] iniciarCuestionario(String comando_0) {
    	Cursor cursor = db.rawQuery(comando_0, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0)
    	};

    	cursor.close();
    	return lamatriz;
    }

    // TabletaPantalla0101 = 2014-11-13
    //Abrir seleccion primero
    public String[] abrirCaptura_0101(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), 
    			cursor.getString(8)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0101 = 2014-11-13
    // TabletaPantalla0101 = 2016-09-18
    // TabletaPantalla0101 = 2017-10-18
    //Guardar Seleccion Primero
    public void guardarCaptura_0101(String comando_00,
    		String comando_01, String fecha_01,
            String comando_02, String hora_01,
            String comando_03, String fechohora_01,
            String comando_04, Integer seleccion_01,
            String comando_05, String tiempo_01,
            String comando_06, Integer seleccion_02,
            String comando_07, String tiempo_02,
            String comando_08, Integer seleccion_03,
            String comando_09,String tiempo_03,
            String comando_10, Integer seleccion_04,
            String comando_11,String tiempo_04,
            String comando_12, Integer seleccion_05,
            String comando_13,String tiempo_05,
            String comando_14, Integer seleccion_06,
            String comando_15,String tiempo_06,
            String comando_16, Integer seleccion_07,
            String comando_17,String tiempo_07,
            String comando_18, Integer seleccion_08,
            String comando_19,String tiempo_08,
            String comando_20, Integer seleccion_09,
            String comando_21,String tiempo_09,
            String comando_28, String el_encuesto,
    		String comando_50) {
    	db.execSQL(comando_00 +
    			 comando_01 + fecha_01 +
                 comando_02 + hora_01 +
                 comando_03 + fechohora_01 +
                 comando_04 + seleccion_01 +
                 comando_05 + tiempo_01 +
                 comando_06 + seleccion_02 +
                 comando_07 + tiempo_02 +
                 comando_08 + seleccion_03 +
                 comando_09 + tiempo_03 +
                 comando_10 + seleccion_04 +
                 comando_11 + tiempo_04 +
                 comando_12 + seleccion_05 +
                 comando_13 + tiempo_05 +
                 comando_14 + seleccion_06 +
                 comando_15 + tiempo_06 +
                 comando_16 + seleccion_07 +
                 comando_17 + tiempo_07 +
                 comando_18 + seleccion_08 +
                 comando_19 + tiempo_08 +
                 comando_20 + seleccion_09 +
                 comando_21 + tiempo_09 +
                 comando_28 + el_encuesto +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0102 = 2014-03-29
    //Abrir seleccion segundo
    public String[] abrirCaptura_0102(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1),cursor.getString(2)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0102 = 2014-03-29
    // Guardar Pantalla SeleccionSegundo
    public void guardarCaptura_0102(String comando_00,
    		 String comando_01, Integer seleccion_10,
             String comando_02, String tiempo_10,
             String comando_03, Integer seleccion_11,
             String comando_04, String tiempo_11,
             String comando_05, Integer seleccion_12,
             String comando_06, String tiempo_12,
    		String comando_50) {
    	db.execSQL(comando_00 +
    			 comando_01 + seleccion_10 +
                 comando_02 + tiempo_10 +
                 comando_03 + seleccion_11 +
                 comando_04 + tiempo_11 +
                 comando_05 + seleccion_12 +
                 comando_06 + tiempo_12 +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0104 = 2019-06-06
    //Abrir Cuestionario Depresion
	public String[] abrirCaptura_0104(String comando_1) { 
  	Cursor cursor = db.rawQuery(comando_1, null);
    	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6)
    	};

    	cursor.close(); 
    	return lamatriz;
	}

    // TabletaPantalla0104 = 2019-06-06
	//Guardar Cuestionario Depresion
    public void guardarCaptura_0104(String comando_00,
    		String comando_01, Integer seleccion_13,
            String comando_02, String tiempo_13,
            String comando_03, Integer seleccion_14,
            String comando_04, String tiempo_14,
            String comando_05, Integer seleccion_15,
            String comando_06, String tiempo_15,
            String comando_07, Integer seleccion_16,
            String comando_08, String tiempo_16,
            String comando_09, Integer seleccion_17,
            String comando_10, String tiempo_17,
            String comando_11, Integer seleccion_18,
            String comando_12, String tiempo_18,
            String comando_13, Integer seleccion_19,
            String comando_14,String tiempo_19,
    		String comando_50) {
    	db.execSQL(comando_00 +
    			  comando_01 + seleccion_13 +
                  comando_02 + tiempo_13 +
                  comando_03 + seleccion_14 +
                  comando_04 + tiempo_14 +
                  comando_05 +seleccion_15 +
                  comando_06 + tiempo_15 +
                  comando_07 +seleccion_16 +
                  comando_08 +tiempo_16 +
                  comando_09 + seleccion_17 +
                  comando_10 +tiempo_17 +
                  comando_11 +seleccion_18 +
                  comando_12 +tiempo_18 +
                  comando_13 + seleccion_19 +
                  comando_14 + tiempo_19 +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0201 = 2014-03-29
    //Abrir Barthel 
    public String[] abrirCaptura_0201(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
    			cursor.getString(8), cursor.getString(9)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0201 = 2014-03-29
    //Guardar Barthel
    public void guardarCaptura_0201(String comando_00,
    		  String comando_01, Integer seleccion_20,
              String comando_02, String tiempo_20,
              String comando_03, Integer seleccion_21,
              String comando_04, String tiempo_21,
              String comando_05, Integer seleccion_22,
              String comando_06, String tiempo_22,
              String comando_07, Integer seleccion_23,
              String comando_08, String tiempo_23,
              String comando_09, Integer seleccion_24,
              String comando_10, String tiempo_24,
              String comando_11, Integer seleccion_25,
              String comando_12, String tiempo_25,
              String comando_13, Integer seleccion_26,
              String comando_14, String tiempo_26,
              String comando_15, Integer seleccion_27,
              String comando_16, String tiempo_27,
              String comando_17, Integer seleccion_28,
              String comando_18, String tiempo_28,
              String comando_19, Integer seleccion_29,
              String comando_20, String tiempo_29,
									String comando_50) {
    	db.execSQL(comando_00 +
    			  comando_01 + seleccion_20 +
                  comando_02 + tiempo_20 +
                  comando_03 + seleccion_21 +
                  comando_04 + tiempo_21 +
                  comando_05 + seleccion_22 +
                  comando_06 + tiempo_22 +
                  comando_07 + seleccion_23 +
                  comando_08 + tiempo_23 +
                  comando_09 + seleccion_24 +
                  comando_10 + tiempo_24 +
                  comando_11 + seleccion_25 +
                  comando_12 + tiempo_25 +
                  comando_13 + seleccion_26 +
                  comando_14 + tiempo_26 +
                  comando_15 + seleccion_27 +
                  comando_16 + tiempo_27 +
                  comando_17 + seleccion_28 +
                  comando_18 + tiempo_28 +
                  comando_19 + seleccion_29 +
                  comando_20 + tiempo_29 +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0204 = 2019-06-24
    //Abrir MiniMentalPrimero
    public String[] abrirCaptura_0204(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
                cursor.getString(8), cursor.getString(9),
                cursor.getString(10), cursor.getString(11), cursor.getString(12), cursor.getString(13),
                cursor.getString(14), cursor.getString(15), cursor.getString(16), cursor.getString(17),
                cursor.getString(18), cursor.getString(19),cursor.getString(20),
                cursor.getString(21), cursor.getString(22), cursor.getString(23)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0204 = 2019-06-24
    //Guardar MiniMentalPrimero
    public void guardarCaptura_0204(String comando_00,
    		String comando_01, Integer seleccion_30,
            String comando_02, String tiempo_30,
            String comando_03, Integer seleccion_31,
            String comando_04, String tiempo_31,
            String comando_05, Integer seleccion_32,
            String comando_06, String tiempo_32,
            String comando_07, Integer seleccion_33,
            String comando_08,  String tiempo_33,
            String comando_09, Integer seleccion_34,
            String comando_10, String tiempo_34,
            String comando_11, Integer seleccion_35,
            String comando_12, String tiempo_35,
            String comando_13, Integer seleccion_36,
            String comando_14, String tiempo_36,
            String comando_15, Integer seleccion_37,
            String comando_16, String tiempo_37,
            String comando_17, Integer seleccion_38,
            String comando_18, String tiempo_38,
            String comando_19, Integer seleccion_39,
            String comando_20, String tiempo_39,
            String comando_21, Integer seleccion_40,
            String comando_22, String tiempo_40,
            String comando_23, Integer seleccion_4101,
            String comando_24, String tiempo_4101,
            String comando_25, Integer seleccion_4102,
            String comando_26, String tiempo_4102,
            String comando_27, Integer seleccion_4103,
            String comando_28, String tiempo_4103,
            String comando_29, Integer seleccion_4201,
            String comando_30, String tiempo_4201,
            String comando_31, Integer seleccion_4202,
            String comando_32, String tiempo_4202,
            String comando_33, Integer seleccion_4203,
            String comando_34, String tiempo_4203,
            String comando_35, Integer seleccion_4204,
            String comando_36, String tiempo_4204,
            String comando_37, Integer seleccion_4205,
            String comando_38, String tiempo_4205,
            String comando_39, Integer seleccion_43,
            String comando_40, String tiempo_43,
            String comando_41, Integer seleccion_4401,
            String comando_42, String tiempo_4401,
            String comando_43, Integer seleccion_4402,
            String comando_44, String tiempo_4402,
            String comando_45, Integer seleccion_4403,
            String comando_46, String tiempo_4403,
            String comando_47, Integer seleccion_4501,
            String comando_48, String tiempo_4501,
            String comando_49, Integer seleccion_4502,
            String comando_51, String tiempo_4502,
    		String comando_50) {
    	db.execSQL(comando_00 +
    			comando_01 + seleccion_30 +
                comando_02 + tiempo_30 +
                comando_03 + seleccion_31 +
                comando_04 + tiempo_31 +
                comando_05 + seleccion_32 +
                comando_06 + tiempo_32 +
                comando_07 + seleccion_33 +
                comando_08 + tiempo_33 +
                comando_09 + seleccion_34 +
                comando_10 + tiempo_34 +
                comando_11 + seleccion_35 +
                comando_12 + tiempo_35 +
                comando_13 + seleccion_36 +
                comando_14 + tiempo_36 +
                comando_15 + seleccion_37 +
                comando_16 + tiempo_37 +
                comando_17 + seleccion_38 +
                comando_18 + tiempo_38 +
                comando_19 + seleccion_39 +
                comando_20 + tiempo_39 +
                comando_21 + seleccion_40 +
                comando_22 + tiempo_40 +
                comando_23 + seleccion_4101 +
                comando_24 + tiempo_4101 +
                comando_25 + seleccion_4102 +
                comando_26 + tiempo_4102 +
                comando_27 + seleccion_4103 +
                comando_28 + tiempo_4103 +
                comando_29 + seleccion_4201 +
                comando_30 + tiempo_4201 +
                comando_31 + seleccion_4202 +
                comando_32 + tiempo_4202 +
                comando_33 + seleccion_4203 +
                comando_34 + tiempo_4203 +
                comando_35 + seleccion_4204 +
                comando_36 + tiempo_4204 +
                comando_37 + seleccion_4205 +
                comando_38 + tiempo_4205 +
                 comando_39 + seleccion_43 +
                comando_40 + tiempo_43 +
                comando_41 + seleccion_4401 +
                comando_42 + tiempo_4401 +
                comando_43 + seleccion_4402 +
                comando_44 + tiempo_4402 +
                comando_45 + seleccion_4403 +
                comando_46 + tiempo_4403 +
                 comando_47 + seleccion_4501 +
                comando_48 + tiempo_4501 +
                comando_49 + seleccion_4502 +
                comando_51 + tiempo_4502 +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0207 = 2019-06-24
    //Abrir MiniMental Segundo
    public String[] abrirCaptura_0207(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4),cursor.getString(5), cursor.getString(6)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0207 = 2019-06-24
    //Guardar MiniMental Segundo
    public void guardarCaptura_0207(String comando_00,
    								String comando_01, Integer seleccion_46,
    								String comando_02, String tiempo_46,
    								String comando_03, Integer seleccion_4701,
    								String comando_04, String tiempo_4701,
    								String comando_05, Integer seleccion_4702,
    								String comando_06, String tiempo_4702,
    								String comando_07, Integer seleccion_4703,
    								String comando_08, String tiempo_4703,
    								String comando_09, Integer seleccion_48,
    								String comando_10, String tiempo_48,
    								String comando_11, Integer seleccion_49,
    								String comando_12, String tiempo_49,
    								String comando_13, Integer seleccion_50,
    								String comando_14, String tiempo_50,
    								String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_46 +
    				comando_02 + tiempo_46 +
    				comando_03 + seleccion_4701 +
    				comando_04 + tiempo_4701 +
    				comando_05 + seleccion_4702 +
    				comando_06 + tiempo_4702 +
    				comando_07 + seleccion_4703 +
    				comando_08 + tiempo_4703 +
    				comando_09 + seleccion_48 +
    				comando_10 + tiempo_48 +
    				comando_11 + seleccion_49 +
    				comando_12 + tiempo_49 +
    				comando_13 + seleccion_50 +
    				comando_14 + tiempo_50 +
    				comando_50
    				);

    	db.close(); 
    }

    // TabletaPantalla0301 = 2014-03-30
    public String[] abrirCaptura_0301(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), 
    			cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0301 = 2019-06-11
    public void guardarCaptura_0301(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, String seleccion_02,
    								String comando_03, String seleccion_03,
    								String comando_04, String seleccion_04,
    								String comando_05, Integer seleccion_05,
    								String comando_06, Integer seleccion_06,
    								String comando_07, Integer seleccion_07,
    								String comando_08, Integer seleccion_08,
    								String comando_09, String seleccion_09,
    								String comando_10, Integer seleccion_10,
    								String comando_11, String seleccion_11,
    								String comando_12, Integer seleccion_12,
    								String comando_13, Integer seleccion_13,
    								String comando_14, Integer seleccion_14,
    								String comando_15, String tiempo_15,
    								String comando_16, String tiempo_16,
    								String comando_17, String tiempo_17,
    								String comando_18, String tiempo_18,
    								String comando_19, String tiempo_19,
    								String comando_20, String tiempo_20,
    								String comando_21, String tiempo_21,
    								String comando_22, String tiempo_22,
    								String comando_23, String tiempo_23,
    								String comando_24, String tiempo_24,
    								String comando_25, String tiempo_25,
    								String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + seleccion_05 +
    				comando_06 + seleccion_06 +
    				comando_07 + seleccion_07 +
    				comando_08 + seleccion_08 +
    				comando_09 + seleccion_09 +
    				comando_10 + seleccion_10 +
    				comando_11 + seleccion_11 +
    				comando_12 + seleccion_12 +
    				comando_13 + seleccion_13 +
    				comando_14 + seleccion_14 +
    				comando_15 + tiempo_15 +
    				comando_16 + tiempo_16 +
    				comando_17 + tiempo_17 +
    				comando_18 + tiempo_18 +
    				comando_19 + tiempo_19 +
    				comando_20 + tiempo_20 +
    				comando_21 + tiempo_21 +
    				comando_22 + tiempo_22 +
    				comando_23 + tiempo_23 +
    				comando_24 + tiempo_24 +
    				comando_25 + tiempo_25 +
    				comando_50
    				);

    	db.close(); 
    }

	// TabletaPantalla0305 = 2019-06-11
	public String[] abrirCaptura_0305(String comando_1) { 
		Cursor cursor = db.rawQuery(comando_1, null);
		cursor.moveToFirst();

		String[] lamatriz = {
				cursor.getString(0)
		};

		cursor.close(); 
		return lamatriz;
	}

	// TabletaPantalla0305 = 2019-06-11
	public void guardarCaptura_0305(String comando_00,
									String comando_01, Integer seleccion_01,
									String comando_02, Integer seleccion_02,
									String comando_03, Integer seleccion_03,
									String comando_04, String tiempo_04,
									String comando_05, String tiempo_05,
									String comando_06, String tiempo_06,
									String comando_50) {
		db.execSQL(comando_00 +
					comando_01 + seleccion_01 +
					comando_02 + seleccion_02 +
					comando_03 + seleccion_03 +
					comando_04 + tiempo_04 +
					comando_05 + tiempo_05 +
					comando_06 + tiempo_06 +
					comando_50
					);

		db.close(); 
	}

    // TabletaPantalla0306 = 2019-06-12
    public String[] abrirCaptura_0306(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
    			cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11),
    			cursor.getString(12)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0306 = 2019-06-12
    public void guardarCaptura_0306(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, Integer seleccion_03,
    								String comando_04, Integer seleccion_04,
    								String comando_05, String seleccion_05,
    								String comando_06, Integer seleccion_06,
    								String comando_07, String seleccion_07,
    								String comando_08, Integer seleccion_08,
    								String comando_09, String seleccion_09,
    								String comando_10, Integer seleccion_10,
    								String comando_11, String seleccion_11,
    								String comando_12, Integer seleccion_12,
    								String comando_13, String seleccion_13,
    								String comando_14, Integer seleccion_14,
    								String comando_15, Integer seleccion_15,
    								String comando_16, String tiempo_16,
    								String comando_17, String tiempo_17,
    								String comando_18, String tiempo_18,
    								String comando_19, String tiempo_19,
    								String comando_20, String tiempo_20,
    								String comando_21, String tiempo_21,
    								String comando_22, String tiempo_22,
    								String comando_23, String tiempo_23,
    								String comando_24, String tiempo_24,
    								String comando_25, String tiempo_25,
    								String comando_26, String tiempo_26,
    								String comando_27, String tiempo_27,
    								String comando_28, String tiempo_28,
    								String comando_29, String tiempo_29,
    								String comando_30, String tiempo_30,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + seleccion_05 +
    				comando_06 + seleccion_06 +
    				comando_07 + seleccion_07 +
    				comando_08 + seleccion_08 +
    				comando_09 + seleccion_09 +
    				comando_10 + seleccion_10 +
    				comando_11 + seleccion_11 +
    				comando_12 + seleccion_12 +
    				comando_13 + seleccion_13 +
    				comando_14 + seleccion_14 +
    				comando_15 + seleccion_15 +
    				comando_16 + tiempo_16 +
    				comando_17 + tiempo_17 +
    				comando_18 + tiempo_18 +
    				comando_19 + tiempo_19 +
    				comando_20 + tiempo_20 +
    				comando_21 + tiempo_21 +
    				comando_22 + tiempo_22 +
    				comando_23 + tiempo_23 +
    				comando_24 + tiempo_24 +
    				comando_25 + tiempo_25 +
    				comando_26 + tiempo_26 +
    				comando_27 + tiempo_27 +
    				comando_28 + tiempo_28 +
    				comando_29 + tiempo_29 +
    				comando_30 + tiempo_30 +
    				comando_50
    				);

    	db.close(); 
    }

	// TabletaPantalla0309 = 2019-06-13
	public String[] abrirCaptura_0309(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

      	String[] lamatriz = {
      			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
      			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
      			cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11),
      			cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getString(15),
      			cursor.getString(16), cursor.getString(17), cursor.getString(18), cursor.getString(19),
      			cursor.getString(20), cursor.getString(21), cursor.getString(22), cursor.getString(23),
      			cursor.getString(24), cursor.getString(25), cursor.getString(26), cursor.getString(27),
      			cursor.getString(28), cursor.getString(29), cursor.getString(30), cursor.getString(31),
      			cursor.getString(32), cursor.getString(33), cursor.getString(34), cursor.getString(35),
      			cursor.getString(36), cursor.getString(37), cursor.getString(38), cursor.getString(39),
      			cursor.getString(40), cursor.getString(41), cursor.getString(42), cursor.getString(43),
      			cursor.getString(44), cursor.getString(45), cursor.getString(46), cursor.getString(47),
      			cursor.getString(48), cursor.getString(49), cursor.getString(50), cursor.getString(51),
      			cursor.getString(52), cursor.getString(53), cursor.getString(54), cursor.getString(55),
      			cursor.getString(56), cursor.getString(57), cursor.getString(57), cursor.getString(59),
      			cursor.getString(60), cursor.getString(61), cursor.getString(62), cursor.getString(63)
    	};

      	cursor.close(); 
    	return lamatriz;
    }

	// TabletaPantalla0309 = 20129-06-17
    public void guardarCaptura_0309(String comando_000,
    		String comando_001, Integer seleccion_03_09_01, String comando_002, Integer lista_seleccion_03_09_01, String comando_003, Integer peso_03_09_01,
    		String comando_004, Integer seleccion_03_09_02, String comando_005, Integer lista_seleccion_03_09_02, String comando_006, Integer peso_03_09_02,
    		String comando_007, Integer seleccion_03_09_03, String comando_008, Integer lista_seleccion_03_09_03, String comando_009, Integer peso_03_09_03,
    		String comando_010, Integer seleccion_03_09_04, String comando_011, Integer lista_seleccion_03_09_04, String comando_012, Integer peso_03_09_04,
    		String comando_013, Integer seleccion_03_09_05, String comando_014, Integer lista_seleccion_03_09_05, String comando_015, Integer peso_03_09_05,
    		String comando_016, Integer seleccion_03_09_06, String comando_017, Integer lista_seleccion_03_09_06, String comando_018, Integer peso_03_09_06,
    		String comando_019, Integer seleccion_03_09_07, String comando_020, Integer lista_seleccion_03_09_07, String comando_021, Integer peso_03_09_07,
    		String comando_022, Integer seleccion_03_09_08, String comando_023, Integer lista_seleccion_03_09_08, String comando_024, Integer peso_03_09_08,
    		String comando_025, Integer seleccion_03_09_09, String comando_026, Integer lista_seleccion_03_09_09, String comando_027, Integer peso_03_09_09,
    		String comando_028, Integer seleccion_03_09_10, String comando_029, Integer lista_seleccion_03_09_10, String comando_030, Integer peso_03_09_10,
    		String comando_031, Integer seleccion_03_09_11, String comando_032, Integer lista_seleccion_03_09_11, String comando_033, Integer peso_03_09_11,
    		String comando_034, Integer seleccion_03_09_12, String comando_035, Integer lista_seleccion_03_09_12, String comando_036, Integer peso_03_09_12,
    		String comando_037, Integer seleccion_03_09_13, String comando_038, Integer lista_seleccion_03_09_13, String comando_039, Integer peso_03_09_13,
    		String comando_040, Integer seleccion_03_09_14,
    		String comando_041, Integer seleccion_03_09_15, String comando_042, Integer lista_seleccion_03_09_15, String comando_043, Integer peso_03_09_15,
    		String comando_044, Integer seleccion_03_09_16, String comando_045, Integer lista_seleccion_03_09_16, String comando_046, Integer peso_03_09_16,
    		String comando_047, Integer seleccion_03_09_17, String comando_048, Integer lista_seleccion_03_09_17, String comando_049, Integer peso_03_09_17,
    		String comando_050, Integer seleccion_03_09_18, String comando_051, Integer lista_seleccion_03_09_18, String comando_052, Integer peso_03_09_18,
    		String comando_053, Integer seleccion_03_09_19, String comando_054, Integer lista_seleccion_03_09_19, String comando_055, Integer peso_03_09_19,
    		String comando_056, Integer seleccion_03_09_20, String comando_057, Integer lista_seleccion_03_09_20, String comando_058, Integer peso_03_09_20,
    		String comando_059, Integer seleccion_03_09_21, String comando_060, Integer lista_seleccion_03_09_21, String comando_061, Integer peso_03_09_21,
    		String comando_062, Integer seleccion_03_09_22,
    		String comando_063, Integer seleccion_03_09_23,
    		String comando_064, Integer seleccion_03_09_24,
    		String comando_065, Integer seleccion_03_09_25,
    		String comando_066, String tiempo_03_09_01_01, String comando_067, String tiempo_03_09_01_02,
    		String comando_068, String tiempo_03_09_02_01, String comando_069, String tiempo_03_09_02_02,
    		String comando_070, String tiempo_03_09_03_01, String comando_071, String tiempo_03_09_03_02,
    		String comando_072, String tiempo_03_09_04_01, String comando_073, String tiempo_03_09_04_02,
    		String comando_074, String tiempo_03_09_05_01, String comando_075, String tiempo_03_09_05_02,
    		String comando_076, String tiempo_03_09_06_01, String comando_077, String tiempo_03_09_06_02,
    		String comando_078, String tiempo_03_09_07_01, String comando_079, String tiempo_03_09_07_02,
    		String comando_080, String tiempo_03_09_08_01, String comando_081, String tiempo_03_09_08_02,
    		String comando_082, String tiempo_03_09_09_01, String comando_083, String tiempo_03_09_09_02,
    		String comando_084, String tiempo_03_09_10_01, String comando_085, String tiempo_03_09_10_02,
    		String comando_086, String tiempo_03_09_11_01, String comando_087, String tiempo_03_09_11_02,
    		String comando_088, String tiempo_03_09_12_01, String comando_089, String tiempo_03_09_12_02,
    		String comando_090, String tiempo_03_09_13_01, String comando_091, String tiempo_03_09_13_02,
    		String comando_092, String tiempo_03_09_14,
    		String comando_093, String tiempo_03_09_15_01, String comando_094, String tiempo_03_09_15_02,
    		String comando_095, String tiempo_03_09_16_01, String comando_096, String tiempo_03_09_16_02,
    		String comando_097, String tiempo_03_09_17_01, String comando_098, String tiempo_03_09_17_02,
    		String comando_099, String tiempo_03_09_18_01, String comando_100, String tiempo_03_09_18_02,
    		String comando_101, String tiempo_03_09_19_01, String comando_102, String tiempo_03_09_19_02,
    		String comando_103, String tiempo_03_09_20_01, String comando_104, String tiempo_03_09_20_02,
    		String comando_105, String tiempo_03_09_21_01, String comando_106, String tiempo_03_09_21_02,
    		String comando_107, String tiempo_03_09_22_01,
    		String comando_108, String tiempo_03_09_23_01,
    		String comando_109, String tiempo_03_09_24_01,
    		String comando_110, String tiempo_03_09_25_01,
			String comando_150) {
    	db.execSQL(comando_000 +
        		comando_001 + seleccion_03_09_01 + comando_002 + lista_seleccion_03_09_01 + comando_003 + peso_03_09_01 +
        		comando_004 + seleccion_03_09_02 + comando_005 + lista_seleccion_03_09_02 + comando_006 + peso_03_09_02 +
        		comando_007 + seleccion_03_09_03 + comando_008 + lista_seleccion_03_09_03 + comando_009 + peso_03_09_03 +
        		comando_010 + seleccion_03_09_04 + comando_011 + lista_seleccion_03_09_04 + comando_012 + peso_03_09_04 +
        		comando_013 + seleccion_03_09_05 + comando_014 + lista_seleccion_03_09_05 + comando_015 + peso_03_09_05 +
        		comando_016 + seleccion_03_09_06 + comando_017 + lista_seleccion_03_09_06 + comando_018 + peso_03_09_06 +
        		comando_019 + seleccion_03_09_07 + comando_020 + lista_seleccion_03_09_07 + comando_021 + peso_03_09_07 +
        		comando_022 + seleccion_03_09_08 + comando_023 + lista_seleccion_03_09_08 + comando_024 + peso_03_09_08 +
        		comando_025 + seleccion_03_09_09 + comando_026 + lista_seleccion_03_09_09 + comando_027 + peso_03_09_09 +
        		comando_028 + seleccion_03_09_10 + comando_029 + lista_seleccion_03_09_10 + comando_030 + peso_03_09_10 +
        		comando_031 + seleccion_03_09_11 + comando_032 + lista_seleccion_03_09_11 + comando_033 + peso_03_09_11 +
        		comando_034 + seleccion_03_09_12 + comando_035 + lista_seleccion_03_09_12 + comando_036 + peso_03_09_12 +
        		comando_037 + seleccion_03_09_13 + comando_038 + lista_seleccion_03_09_13 + comando_039 + peso_03_09_13 +
        		comando_040 + seleccion_03_09_14 +
        		comando_041 + seleccion_03_09_15 + comando_042 + lista_seleccion_03_09_15 + comando_043 + peso_03_09_15 +
        		comando_044 + seleccion_03_09_16 + comando_045 + lista_seleccion_03_09_16 + comando_046 + peso_03_09_16 +
        		comando_047 + seleccion_03_09_17 + comando_048 + lista_seleccion_03_09_17 + comando_049 + peso_03_09_17 +
        		comando_050 + seleccion_03_09_18 + comando_051 + lista_seleccion_03_09_18 + comando_052 + peso_03_09_18 +
        		comando_053 + seleccion_03_09_19 + comando_054 + lista_seleccion_03_09_19 + comando_055 + peso_03_09_19 +
        		comando_056 + seleccion_03_09_20 + comando_057 + lista_seleccion_03_09_20 + comando_058 + peso_03_09_20 +
        		comando_059 + seleccion_03_09_21 + comando_060 + lista_seleccion_03_09_21 + comando_061 + peso_03_09_21 +
        		comando_062 + seleccion_03_09_22 +
        		comando_063 + seleccion_03_09_23 +
        		comando_064 + seleccion_03_09_23 +
        		comando_065 + seleccion_03_09_23 +
        		comando_066 + tiempo_03_09_01_01 + comando_067 + tiempo_03_09_01_02 +
        		comando_068 + tiempo_03_09_02_01 + comando_069 + tiempo_03_09_02_02 +
        		comando_070 + tiempo_03_09_03_01 + comando_071 + tiempo_03_09_03_02 +
        		comando_072 + tiempo_03_09_04_01 + comando_073 + tiempo_03_09_04_02 +
        		comando_074 + tiempo_03_09_05_01 + comando_075 + tiempo_03_09_05_02 +
        		comando_076 + tiempo_03_09_06_01 + comando_077 + tiempo_03_09_06_02 +
        		comando_078 + tiempo_03_09_07_01 + comando_079 + tiempo_03_09_07_02 +
        		comando_080 + tiempo_03_09_08_01 + comando_081 + tiempo_03_09_08_02 +
        		comando_082 + tiempo_03_09_09_01 + comando_083 + tiempo_03_09_09_02 +
        		comando_084 + tiempo_03_09_10_01 + comando_085 + tiempo_03_09_10_02 +
        		comando_086 + tiempo_03_09_11_01 + comando_087 + tiempo_03_09_11_02 +
        		comando_088 + tiempo_03_09_12_01 + comando_089 + tiempo_03_09_12_02 +
        		comando_090 + tiempo_03_09_13_01 + comando_091 + tiempo_03_09_13_02 +
        		comando_092 + tiempo_03_09_14 +
        		comando_093 + tiempo_03_09_15_01 + comando_094 + tiempo_03_09_15_02 +
        		comando_095 + tiempo_03_09_16_01 + comando_096 + tiempo_03_09_16_02 +
        		comando_097 + tiempo_03_09_17_01 + comando_098 + tiempo_03_09_17_02 +
        		comando_099 + tiempo_03_09_18_01 + comando_100 + tiempo_03_09_18_02 +
        		comando_101 + tiempo_03_09_19_01 + comando_102 + tiempo_03_09_19_02 +
        		comando_103 + tiempo_03_09_20_01 + comando_104 + tiempo_03_09_20_02 +
        		comando_105 + tiempo_03_09_21_01 + comando_106 + tiempo_03_09_21_02 +
        		comando_107 + tiempo_03_09_22_01 +
        		comando_108 + tiempo_03_09_23_01 +
        		comando_109 + tiempo_03_09_23_01 +
        		comando_110 + tiempo_03_09_23_01 +
				comando_150
    		);

    	db.close(); 
    }

    // TabletaPantalla0310 = 2019-07-02
    public String[] abrirCaptura_0310(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0310 = 2019-07-02
    public void guardarCaptura_0310(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, Integer seleccion_03,
    								String comando_04, Integer seleccion_04,
    								String comando_05, String tiempo_05,
    								String comando_06, String tiempo_06,
    								String comando_07, String tiempo_07,
    								String comando_08, String tiempo_08,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + tiempo_05 +
    				comando_06 + tiempo_06 +
    				comando_07 + tiempo_07 +
    				comando_08 + tiempo_08 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla031101 = 2019-07-03
    public String[] abrirCaptura_0311XX(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4),
    			cursor.getString(5), cursor.getString(6), cursor.getString(7), cursor.getString(8), cursor.getString(9),
    			cursor.getString(10), cursor.getString(11), cursor.getString(12)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla031101 = 2019-07-03
    public void guardarCaptura_0311XX(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, Integer seleccion_03,
    								String comando_04, String seleccion_04,
    								String comando_05, Integer seleccion_05,
    								String comando_06, Integer seleccion_06,
    								String comando_07, Integer seleccion_07,
    								String comando_08, String seleccion_08,
    								String comando_09, Integer seleccion_09,
    								String comando_10, Integer seleccion_10,
    								String comando_11, String seleccion_11,
    								String comando_12, Integer seleccion_12,
    								String comando_13, Integer seleccion_13,
    								String comando_14, Integer seleccion_14,
    								String comando_15, String tiempo_15,
    								String comando_16, String tiempo_16,
    								String comando_17, String tiempo_17,
    								String comando_18, String tiempo_18,
    								String comando_19, String tiempo_19,
    								String comando_20, String tiempo_20,
    								String comando_21, String tiempo_21,
    								String comando_22, String tiempo_22,
    								String comando_23, String tiempo_23,
    								String comando_24, String tiempo_24,
    								String comando_25, String tiempo_25,
    								String comando_26, String tiempo_26,
    								String comando_27, String tiempo_27,
    								String comando_28, String tiempo_28,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + seleccion_05 +
    				comando_06 + seleccion_06 +
    				comando_07 + seleccion_07 +
    				comando_08 + seleccion_08 +
    				comando_09 + seleccion_09 +
    				comando_10 + seleccion_10 +
    				comando_11 + seleccion_11 +
    				comando_12 + seleccion_12 +
    				comando_13 + seleccion_13 +
    				comando_14 + seleccion_14 +
    				comando_15 + tiempo_15 +
    				comando_16 + tiempo_16 +
    				comando_17 + tiempo_17 +
    				comando_18 + tiempo_18 +
    				comando_19 + tiempo_19 +
    				comando_20 + tiempo_20 +
    				comando_21 + tiempo_21 +
    				comando_22 + tiempo_22 +
    				comando_23 + tiempo_23 +
    				comando_24 + tiempo_24 +
    				comando_25 + tiempo_25 +
    				comando_26 + tiempo_26 +
    				comando_27 + tiempo_27 +
    				comando_28 + tiempo_28 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla0312 = 2019-08-20
    public String[] abrirCaptura_0312(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0312 = 2019-08-20
    public void guardarCaptura_0312(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, String tiempo_03,
    								String comando_04, String tiempo_04,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + tiempo_03 +
    				comando_04 + tiempo_04 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla0401 = 2019-08-20
    public String[] abrirCaptura_0401(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
    			cursor.getString(8)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0312 = 2019-08-20
    public void guardarCaptura_0401(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, String seleccion_03,
    								String comando_04, Integer seleccion_04,
    								String comando_05, Integer seleccion_05,
    								String comando_06, String seleccion_06,
    								String comando_07, Integer seleccion_07,
    								String comando_08, Integer seleccion_08,
    								String comando_09, String seleccion_09,
    								String comando_10, Integer seleccion_10,
    								String comando_11, Integer seleccion_11,
    								String comando_12, String tiempo_12,
    								String comando_13, String tiempo_13,
    								String comando_14, String tiempo_14,
    								String comando_15, String tiempo_15,
    								String comando_16, String tiempo_16,
    								String comando_17, String tiempo_17,
    								String comando_18, String tiempo_18,
    								String comando_19, String tiempo_19,
    								String comando_20, String tiempo_20,
    								String comando_21, String tiempo_21,
    								String comando_22, String tiempo_22,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + seleccion_05 +
    				comando_06 + seleccion_06 +
    				comando_07 + seleccion_07 +
    				comando_08 + seleccion_08 +
    				comando_09 + seleccion_09 +
    				comando_10 + seleccion_10 +
    				comando_11 + seleccion_11 +
    				comando_12 + tiempo_12 +
    				comando_13 + tiempo_13 +
    				comando_14 + tiempo_14 +
    				comando_15 + tiempo_15 +
    				comando_16 + tiempo_16 +
    				comando_17 + tiempo_17 +
    				comando_18 + tiempo_18 +
    				comando_19 + tiempo_19 +
    				comando_20 + tiempo_20 +
    				comando_21 + tiempo_21 +
    				comando_22 + tiempo_22 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla0401 = 2019-08-20
    public String[] abrirCaptura_0404(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7),
    			cursor.getString(8)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

    // TabletaPantalla0312 = 2019-08-20
    public void guardarCaptura_0404(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, Integer seleccion_02,
    								String comando_03, String seleccion_03,
    								String comando_04, Integer seleccion_04,
    								String comando_05, Integer seleccion_05,
    								String comando_06, String seleccion_06,
    								String comando_07, Integer seleccion_07,
    								String comando_08, Integer seleccion_08,
    								String comando_09, String seleccion_09,
    								String comando_10, String tiempo_10,
    								String comando_11, String tiempo_11,
    								String comando_12, String tiempo_12,
    								String comando_13, String tiempo_13,
    								String comando_14, String tiempo_14,
    								String comando_15, String tiempo_15,
    								String comando_16, String tiempo_16,
    								String comando_17, String tiempo_17,
    								String comando_18, String tiempo_18,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_03 + seleccion_03 +
    				comando_04 + seleccion_04 +
    				comando_05 + seleccion_05 +
    				comando_06 + seleccion_06 +
    				comando_07 + seleccion_07 +
    				comando_08 + seleccion_08 +
    				comando_09 + seleccion_09 +
    				comando_10 + tiempo_10 +
    				comando_11 + tiempo_11 +
    				comando_12 + tiempo_12 +
    				comando_13 + tiempo_13 +
    				comando_14 + tiempo_14 +
    				comando_15 + tiempo_15 +
    				comando_16 + tiempo_16 +
    				comando_17 + tiempo_17 +
    				comando_18 + tiempo_18 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla0407 = 2019-09-07
	public String[] abrirCaptura_0407(String comando_1) { 
		Cursor cursor = db.rawQuery(comando_1, null);
		cursor.moveToFirst();

		String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3)
		};

		cursor.close(); 
		return lamatriz;
	}

    // TabletaPantalla0407 = 2019-09-07
	public void guardarCaptura_0407(String comando_00,
									String comando_01, Integer seleccion_01,
									String comando_02, Integer seleccion_02,
									String comando_03, Integer seleccion_03,
    								String comando_04, Integer seleccion_04,
    								String comando_05, String tiempo_05,
    								String comando_06, String tiempo_06,
    								String comando_07, String tiempo_07,
    								String comando_08, String tiempo_08,
									String comando_50) {
		db.execSQL(comando_00 +
					comando_01 + seleccion_01 +
					comando_02 + seleccion_02 +
					comando_03 + seleccion_03 +
					comando_04 + seleccion_04 +
					comando_05 + tiempo_05 +
					comando_06 + tiempo_06 +
					comando_07 + tiempo_07 +
					comando_08 + tiempo_08 +
					comando_50
    			);

    	db.close(); 
	}

	// TabletaPantalla0805 = 2017-12-11
	public String[] abrirCaptura_0805(String comando_1) { 
	  	Cursor cursor = db.rawQuery(comando_1, null);
	    	cursor.moveToFirst();

	    	String[] lamatriz = {
	    			cursor.getString(0) 
	  	};

	  	cursor.close(); 
	  	return lamatriz;
	  }

    // TabletaPantalla0805 = 2017-12-11
    // dTabletaPantalla0805 = 2017-12-11
    public void guardarCaptura_0805(String comando_00,
    								String comando_01, String seleccion_01,
    								String comando_02, String tiempo_02,
									String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + tiempo_02 +
    				comando_50
				);

    	db.close(); 
    }

    // TabletaPantalla0811 = 2020-02-03
	public String[] abrirCaptura_0811(String comando_1) { 
	  	Cursor cursor = db.rawQuery(comando_1, null);
	    	cursor.moveToFirst();

	    	String[] lamatriz = {
	    			cursor.getString(0) 
	  	};

	  	cursor.close(); 
	  	return lamatriz;
	  }

    // TabletaPantalla0811 = 2017-07-18
    public String buscarMuestras(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null); 
    	String lamatriz = null;

    	if ((cursor != null) && (cursor.getCount() > 0) && (cursor.moveToFirst())) {
    		lamatriz = cursor.getString(0);
    	}
    	
    	cursor.close(); 
		return lamatriz; 
    } 

    // TabletaPantalla0811 = 2020-02-03
    public void guardarCaptura_0811(String comando_00,
    								String comando_01, String seleccion_01,
    								String comando_02, String seleccion_02,
    								String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + seleccion_02 +
    				comando_50
    			);

    	db.close(); 
    }

    // TabletaPantalla0815 = 2014-04-20
    // TabletaPantalla0815 = 2019-10-20
    public String[] abrirCaptura_0815(String comando_1) { 
    	Cursor cursor = db.rawQuery(comando_1, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
      			cursor.getString(0),
      			cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5),
      			cursor.getString(6), cursor.getString(7), cursor.getString(8), cursor.getString(9), cursor.getString(10),
      			cursor.getString(11), cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getString(15),
      			cursor.getString(16), cursor.getString(17), cursor.getString(18), cursor.getString(19), cursor.getString(20),
      			cursor.getString(21), cursor.getString(22), cursor.getString(23), cursor.getString(24), cursor.getString(25),
      			cursor.getString(26), cursor.getString(27), cursor.getString(28), cursor.getString(29), cursor.getString(30),
      			cursor.getString(31), cursor.getString(32), cursor.getString(33), cursor.getString(34), cursor.getString(35),
      			cursor.getString(36), cursor.getString(37), cursor.getString(38), cursor.getString(39), cursor.getString(40),
      			cursor.getString(41), cursor.getString(42), cursor.getString(43), cursor.getString(44), cursor.getString(45),
      			cursor.getString(46), cursor.getString(47), cursor.getString(48), cursor.getString(49), cursor.getString(50),
      			cursor.getString(51), cursor.getString(52), cursor.getString(53), cursor.getString(54), cursor.getString(55),
      			cursor.getString(56), cursor.getString(57), cursor.getString(58), cursor.getString(59), cursor.getString(60),
      			cursor.getString(61), cursor.getString(62), cursor.getString(63), cursor.getString(64), cursor.getString(65),
      			cursor.getString(66), cursor.getString(67), cursor.getString(68), cursor.getString(69), cursor.getString(70),
      			cursor.getString(71), cursor.getString(72), cursor.getString(73), cursor.getString(74), cursor.getString(75),
      			cursor.getString(76), cursor.getString(77), cursor.getString(78), cursor.getString(79), cursor.getString(80),
      			cursor.getString(81), cursor.getString(82), cursor.getString(83), cursor.getString(84), cursor.getString(85),
      			cursor.getString(86), cursor.getString(87), cursor.getString(88), cursor.getString(89), cursor.getString(90),
      			cursor.getString(91), cursor.getString(92), cursor.getString(93), cursor.getString(94), cursor.getString(95),
      			cursor.getString(96), cursor.getString(97), cursor.getString(98), cursor.getString(99), cursor.getString(100),
      			cursor.getString(101), cursor.getString(102), cursor.getString(103), cursor.getString(104), cursor.getString(105),
      			cursor.getString(106), cursor.getString(107), cursor.getString(108), cursor.getString(109), cursor.getString(110),
      			cursor.getString(111), cursor.getString(112), cursor.getString(113), cursor.getString(114), cursor.getString(115)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

	// TabletaPantalla0815 = 2014-04-20
    public void guardarCaptura_0815(String comando_00,
    								String comando_01, Integer seleccion_01,
    								String comando_02, String tiempo_01,
    								String comando_03, String fecha_01,
    								String comando_04, String hora_01,
    								String comando_05, String fechohora_01,
    								String comando_06, String la_latitud_b,
    								String comando_07, String la_longitud_b,
    								String comando_50) {
    	db.execSQL(comando_00 +
    				comando_01 + seleccion_01 +
    				comando_02 + tiempo_01 +
    				comando_03 + fecha_01 +
    				comando_04 + hora_01 +
    				comando_05 + fechohora_01 +
    				comando_06 + la_latitud_b +
    				comando_07 + la_longitud_b +
    				comando_50
    			);

    	db.close(); 
    }

	// TabletaPantalla0815 = 2016-02-28
    public String[] abrirCaptura_chorizo(String comando_2) { 
    	Cursor cursor = db.rawQuery(comando_2, null);
      	cursor.moveToFirst();

    	String[] lamatriz = {
    			cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
    			cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), 
    			cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11),
    			cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getString(15),
      			cursor.getString(16), cursor.getString(17), cursor.getString(18), cursor.getString(19),
      			cursor.getString(20), cursor.getString(21), cursor.getString(22), cursor.getString(23),
      			cursor.getString(24), cursor.getString(25), cursor.getString(26), cursor.getString(27),
      			cursor.getString(28), cursor.getString(29), cursor.getString(30), cursor.getString(31),
      			cursor.getString(32), cursor.getString(33), cursor.getString(34), cursor.getString(35),
      			cursor.getString(36), cursor.getString(37), cursor.getString(38), cursor.getString(39),
      			cursor.getString(40), cursor.getString(41), cursor.getString(42), cursor.getString(43),
      			cursor.getString(44), cursor.getString(45), cursor.getString(46), cursor.getString(47),
      			cursor.getString(48), cursor.getString(49), cursor.getString(50), cursor.getString(51),
      			cursor.getString(52), cursor.getString(53), cursor.getString(54), cursor.getString(55),
      			cursor.getString(56), cursor.getString(57), cursor.getString(58), cursor.getString(59),
      			cursor.getString(60), cursor.getString(61), cursor.getString(62), cursor.getString(63),
      			cursor.getString(64), cursor.getString(65), cursor.getString(66), cursor.getString(67),
      			cursor.getString(68), cursor.getString(69), cursor.getString(70), cursor.getString(71),
      			cursor.getString(72), cursor.getString(73), cursor.getString(74), cursor.getString(75),
      			cursor.getString(76), cursor.getString(77), cursor.getString(78), cursor.getString(79),
      			cursor.getString(80), cursor.getString(81), cursor.getString(82), cursor.getString(83),
      			cursor.getString(84), cursor.getString(85), cursor.getString(86), cursor.getString(87),
      			cursor.getString(88), cursor.getString(89), cursor.getString(90), cursor.getString(91),
      			cursor.getString(92), cursor.getString(93), cursor.getString(94), cursor.getString(95),
      			cursor.getString(96), cursor.getString(97), cursor.getString(98), cursor.getString(99),
      			cursor.getString(100), cursor.getString(101), cursor.getString(102), cursor.getString(103),
      			cursor.getString(104), cursor.getString(105), cursor.getString(106), cursor.getString(107),
      			cursor.getString(108), cursor.getString(109), cursor.getString(110), cursor.getString(111),
      			cursor.getString(112), cursor.getString(113), cursor.getString(114), cursor.getString(115),
      			cursor.getString(116), cursor.getString(117), cursor.getString(118), cursor.getString(119),
      			cursor.getString(120), cursor.getString(121), cursor.getString(122), cursor.getString(123),
      			cursor.getString(124), cursor.getString(125), cursor.getString(126), cursor.getString(127)
    	};

    	cursor.close(); 
    	return lamatriz;
    }

/*
  	String[] lamatriz = new String[15];

  	for(int i=1;i<=10;i++)
  		lamatriz[i] = cursor.getString(i-1);

*/

}
