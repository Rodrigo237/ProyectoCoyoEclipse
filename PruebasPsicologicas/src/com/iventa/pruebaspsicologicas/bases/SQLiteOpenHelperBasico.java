package com.iventa.pruebaspsicologicas.bases;

import android.content.Context; 
import android.database.sqlite.SQLiteDatabase; 
import android.database.sqlite.SQLiteOpenHelper; 
  
public class SQLiteOpenHelperBasico extends SQLiteOpenHelper { 
  
    private static final String DATABASE_NAME = "CuestionarioBasico";
    private static final int DATABASE_VERSION = 1; 
      
    public static class TablaPosicionador{
        public static String TABLA_POSICIONADOR = "posicionador";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_POSICION = "posicion";
        public static String COLUMNA_TABLETA = "tableta";
        public static String COLUMNA_ENCUESTO = "encuesto";
        public static String COLUMNA_REFIERE = "refiere";
    } 

    public static class TablaCuestionarioBasico{ 
        public static String TABLA_CUESTIONARIO_BASICO = "cuestionariobasico";
        public static String COLUMNA_SECUENCIA = "secuencia";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_CADENA = "cadena";
        public static String COLUMNA_MUNICIPIO = "municipio";
        public static String COLUMNA_AGEB = "ageb";
        public static String COLUMNA_AREA = "area";
        public static String COLUMNA_MANZANA = "manzana";
        public static String COLUMNA_VIVIENDA = "vivienda";
        public static String COLUMNA_NOMBRE = "nombre";
        public static String COLUMNA_PATERNO = "paterno";
        public static String COLUMNA_MATERNO = "materno";
        public static String COLUMNA_NOMBRE_CO = "nombre_co";
        public static String COLUMNA_PATERNO_CO = "paterno_co";
        public static String COLUMNA_MATERNO_CO = "materno_co";
        public static String COLUMNA_SEXO = "sexo";
        public static String COLUMNA_EDAD = "edad";
        public static String COLUMNA_EDAD_HOY = "edad_hoy";
        public static String COLUMNA_FECHA = "fecha";
        public static String COLUMNA_HORA_INI = "hora_ini";
        public static String COLUMNA_FECHOR_INI = "fechor_ini";
        public static String COLUMNA_LATITUD_A = "latitud_a";
        public static String COLUMNA_LONGITUD_A = "longitud_a";
        public static String COLUMNA_P_0101 = "p_0101"; //Pregunta 1
	    public static String COLUMNA_T_0101 = "t_0101";
	    /*  public static String COLUMNA_P_0102 = "p_0102";
	        public static String COLUMNA_T_0102 = "t_0102";
	        public static String COLUMNA_P_0103 = "p_0103";
	        public static String COLUMNA_T_0103 = "t_0103";
	        public static String COLUMNA_P_0104 = "p_0104";
	        public static String COLUMNA_T_0104 = "t_0104";
	        public static String COLUMNA_P_0105 = "t_0105";
	        public static String COLUMNA_T_0105 = "t_0105";*/
        public static String COLUMNA_P_0201 = "p_0201"; // Pregunta 2
        public static String COLUMNA_T_0201 = "t_0201";
      /*  public static String COLUMNA_P_0202 = "p_0202"; 
        public static String COLUMNA_T_0202 = "t_0202"; 
        public static String COLUMNA_P_0203 = "p_0203";
        public static String COLUMNA_T_0203 = "t_0203"; 
        public static String COLUMNA_P_0204 = "p_0204";
        public static String COLUMNA_T_0204 = "t_0204"; 
        public static String COLUMNA_P_0205 = "p_0205";		
        public static String COLUMNA_T_0205 = "t_0205";	*/	
        public static String COLUMNA_P_0301 = "p_0301";	//Pregunta 3
        public static String COLUMNA_T_0301 = "t_0301";	
    /*    public static String COLUMNA_P_0302 = "p_0302";		
        public static String COLUMNA_T_0302 = "t_0302";		
        public static String COLUMNA_P_0303 = "p_0303";	
        public static String COLUMNA_T_0303 = "t_0303";	
        public static String COLUMNA_P_0304 = "p_0304";		
        public static String COLUMNA_T_0304 = "t_0304";		
        public static String COLUMNA_P_0305 = "p_0305"; 
        public static String COLUMNA_T_0305 = "t_0305"; */
        public static String COLUMNA_P_0401 = "p_0401";//Pregunta 4
        public static String COLUMNA_T_0401 = "t_0401"; 
      /*  public static String COLUMNA_P_0402 = "p_0402"; 
        public static String COLUMNA_T_0402 = "t_0402"; 
        public static String COLUMNA_P_0403 = "p_0403"; 
        public static String COLUMNA_T_0403 = "t_0403"; 
        public static String COLUMNA_P_0404 = "p_0404"; 
        public static String COLUMNA_T_0404 = "t_0404"; 
        public static String COLUMNA_P_0405 = "p_0405"; 
        public static String COLUMNA_T_0405 = "t_0405"; */
        public static String COLUMNA_P_0501 = "p_0501"; //Pregunta 5	
        public static String COLUMNA_T_0501 = "t_0501";  
     /*   public static String COLUMNA_P_0502 = "p_0502"; 
        public static String COLUMNA_T_0502 = "t_0502"; 
        public static String COLUMNA_P_0503 = "p_0503"; 
        public static String COLUMNA_T_0503 = "t_0503"; 
        public static String COLUMNA_P_0504 = "p_0204";		
        public static String COLUMNA_T_0504 = "t_0204";		
        public static String COLUMNA_P_0505 = "p_0505";	
        public static String COLUMNA_T_0505 = "t_0505";	*/
        public static String COLUMNA_P_0601 = "p_0601";	//Pregunta 6
        public static String COLUMNA_T_0601 = "t_0601";	
     /*   public static String COLUMNA_P_0602 = "p_0602";	
        public static String COLUMNA_T_0602 = "t_0602";	
        public static String COLUMNA_P_0603 = "p_0603";		
        public static String COLUMNA_T_0603 = "t_0603";	
        public static String COLUMNA_P_0604 = "p_0604";
        public static String COLUMNA_T_0604 = "t_0604";
        public static String COLUMNA_P_0605 = "p_0605";		
        public static String COLUMNA_T_0605 = "t_0605";	*/	
        public static String COLUMNA_P_0701 = "p_0701";//Pregunta 7
        public static String COLUMNA_T_0701 = "t_0701";
      /*  public static String COLUMNA_P_0702 = "p_0702";
        public static String COLUMNA_T_0702 = "t_0702";
        public static String COLUMNA_P_0703 = "p_0703";
        public static String COLUMNA_T_0703 = "t_0703";
        public static String COLUMNA_P_0704 = "p_0704";
        public static String COLUMNA_T_0704 = "t_0704";
        public static String COLUMNA_P_0705 = "p_0705";
        public static String COLUMNA_T_0705 = "t_0705"; */
        public static String COLUMNA_P_0801 = "p_0801";// Pregunta 8
        public static String COLUMNA_T_0801 = "t_0801";			
     /*   public static String COLUMNA_P_0802 = "p_0802"; 	
        public static String COLUMNA_T_0802 = "t_0802"; 	
        public static String COLUMNA_P_0803 = "p_0803"; 	
        public static String COLUMNA_T_0803 = "t_0803"; 	
        public static String COLUMNA_P_0804 = "p_0804"; 	
        public static String COLUMNA_T_0804 = "t_0804";		
        public static String COLUMNA_P_0805 = "p_0805"; 	
        public static String COLUMNA_T_0805 = "t_0805"; */
        public static String COLUMNA_P_0901 = "p_0901";	//Pregunta 9
        public static String COLUMNA_T_0901 = "t_0901";	
     /*   public static String COLUMNA_P_0902 = "p_0902";
        public static String COLUMNA_T_0902 = "t_0902";	
        public static String COLUMNA_P_0903 = "p_0903";		
        public static String COLUMNA_T_0903 = "t_0903";		
        public static String COLUMNA_P_0904 = "p_0904";	
        public static String COLUMNA_T_0904 = "t_0904";	
        public static String COLUMNA_P_0905 = "p_0905";		
        public static String COLUMNA_T_0905 = "t_0905";	*/	
        public static String COLUMNA_P_1001 = "p_1001";// Pregunta 10		
        public static String COLUMNA_T_1001 = "t_1001";		
     /*   public static String COLUMNA_P_1002 = "p_1002";		
        public static String COLUMNA_T_1002 = "t_1002";		
        public static String COLUMNA_P_1003 = "p_1003";		
        public static String COLUMNA_T_1003 = "t_1003";		
        public static String COLUMNA_P_1004 = "p_1004";
        public static String COLUMNA_T_1004 = "t_1004";
        public static String COLUMNA_P_1005 = "p_1005";
        public static String COLUMNA_T_1005 = "t_1005";	*/
        public static String COLUMNA_P_1101 = "p_1101";	//Pregunta 11
        public static String COLUMNA_T_1101 = "t_1101";	
      /*  public static String COLUMNA_P_1102 = "p_1102";	
        public static String COLUMNA_T_1102 = "t_1102";	
        public static String COLUMNA_P_1103 = "p_1103";	
        public static String COLUMNA_T_1103 = "t_1103";	
        public static String COLUMNA_P_1104 = "p_1104";	
        public static String COLUMNA_T_1104 = "t_1104";	
        public static String COLUMNA_P_1105 = "p_1105";	
        public static String COLUMNA_T_1105 = "t_1105";	*/
        public static String COLUMNA_P_1201 = "p_1201";//Pregunta 12	
        public static String COLUMNA_T_1201 = "t_1201";	
       /* public static String COLUMNA_P_1202 = "p_1202";	
        public static String COLUMNA_T_1202 = "t_1202";	
        public static String COLUMNA_P_1203 = "p_1203";	
        public static String COLUMNA_T_1203 = "t_1203";	
        public static String COLUMNA_P_1204 = "p_1204";
        public static String COLUMNA_T_1204 = "t_1204";
        public static String COLUMNA_P_1205 = "p_1205";
        public static String COLUMNA_T_1205 = "t_1205";*/
        public static String COLUMNA_P_1301 = "p_1301";//Pregunta 13
        public static String COLUMNA_T_1301 = "t_1301";
       /* public static String COLUMNA_P_1302 = "p_1302";
        public static String COLUMNA_T_1302 = "t_1302";
        public static String COLUMNA_P_1303 = "p_1303";
        public static String COLUMNA_T_1303 = "t_1303";
        public static String COLUMNA_P_1304 = "p_1304";
        public static String COLUMNA_T_1304 = "t_1304";*/
        public static String COLUMNA_P_1401 = "p_1401";//Pregunta 14
        public static String COLUMNA_T_1401 = "t_1401";
      /*  public static String COLUMNA_P_1402 = "p_1402";
        public static String COLUMNA_T_1402 = "t_1402";
        public static String COLUMNA_P_1403 = "p_1403"; 
        public static String COLUMNA_T_1403 = "t_1403"; 
        public static String COLUMNA_P_1404 = "p_1404"; 
        public static String COLUMNA_T_1404 = "t_1404"; */
        public static String COLUMNA_P_1501 = "p_1501";//Pregunta 15 
        public static String COLUMNA_T_1501 = "t_1501"; 
      /*  public static String COLUMNA_P_1502 = "p_1502"; 
        public static String COLUMNA_T_1502 = "t_1502"; 
        public static String COLUMNA_P_1503 = "p_1503"; 
        public static String COLUMNA_T_1503 = "t_1503"; 
        public static String COLUMNA_P_1504 = "p_1504"; 
        public static String COLUMNA_T_1504 = "t_1504"; */ 
        public static String COLUMNA_P_1601 = "p_1601";//Pregunta 16 
        public static String COLUMNA_T_1601 = "t_1601"; 
      /*  public static String COLUMNA_P_1602 = "p_1602"; 
        public static String COLUMNA_T_1602 = "t_1602";  
        public static String COLUMNA_P_1603 = "p_1603"; 
        public static String COLUMNA_T_1603 = "t_1603"; 
        public static String COLUMNA_P_1604 = "p_1604"; 
        public static String COLUMNA_T_1604 = "t_1604"; */  
        public static String COLUMNA_P_1701 = "p_1701";//Pregunta 17 
        public static String COLUMNA_T_1701 = "t_1701"; 
        public static String COLUMNA_P_1702 = "p_1702"; 
        public static String COLUMNA_T_1702 = "t_1702"; 
        public static String COLUMNA_P_1703 = "p_1703"; 
        public static String COLUMNA_T_1703 = "t_1703"; 
        public static String COLUMNA_P_1704 = "p_1704"; 
        public static String COLUMNA_T_1704 = "t_1704";
        public static String COLUMNA_P_1801 = "p_1801"; //Pregunta 18 
        public static String COLUMNA_T_1801 = "t_1801"; 
        public static String COLUMNA_P_1802 = "p_1802"; 
        public static String COLUMNA_T_1802 = "t_1802"; 
        public static String COLUMNA_P_1803 = "p_1803"; 
        public static String COLUMNA_T_1803 = "t_1803"; 
        public static String COLUMNA_P_1804 = "p_1804"; 
        public static String COLUMNA_T_1804 = "t_1804";
        public static String COLUMNA_P_1901 = "p_1901";// Pregunta19		
        public static String COLUMNA_T_1901 = "t_1901";		
        public static String COLUMNA_P_1902= "p_1902"; 
        public static String COLUMNA_T_1902 = "t_1902"; 
        public static String COLUMNA_P_1903 = "p_1903"; 
        public static String COLUMNA_T_1903 = "t_1903"; 
        public static String COLUMNA_P_1904 = "p_1904"; 
        public static String COLUMNA_T_1904 = "t_1904"; 
        public static String COLUMNA_P_2001 = "p_2001";//Pregunta20 
        public static String COLUMNA_T_2001 = "t_2001";
        public static String COLUMNA_P_2002 = "p_2002";
        public static String COLUMNA_T_2002 = "t_2002";
        public static String COLUMNA_P_2101 = "p_2101";//Pregunta21
        public static String COLUMNA_T_2101 = "t_2101";
        public static String COLUMNA_P_2102 = "p_2102";
        public static String COLUMNA_T_2102 = "t_2102";
        public static String COLUMNA_P_2103 = "p_2103";
        public static String COLUMNA_T_2103 = "t_2103";
        public static String COLUMNA_P_2201 = "p_2201";//Pregunta22
        public static String COLUMNA_T_2201 = "t_2201";
        public static String COLUMNA_P_2202 = "p_2202";
        public static String COLUMNA_T_2202 = "t_2202";
        public static String COLUMNA_P_2301 = "p_2301";//Pregunta23
        public static String COLUMNA_T_2301 = "t_2301";
        public static String COLUMNA_P_2302 = "p_2302";
        public static String COLUMNA_T_2302 = "t_2302";
        public static String COLUMNA_P_2303 = "p_2303";
        public static String COLUMNA_T_2303 = "t_2303";
        public static String COLUMNA_P_2401 = "p_2401";//Pregunta24
        public static String COLUMNA_T_2401 = "t_2401";
        public static String COLUMNA_P_2402 = "p_2402";	
        public static String COLUMNA_T_2402 = "t_2402";	
        public static String COLUMNA_P_2403 = "p_2403";
        public static String COLUMNA_T_2403 = "t_2403";
        public static String COLUMNA_P_2501 = "p_2501";//Pregunta25
        public static String COLUMNA_T_2501 = "t_2501";
        public static String COLUMNA_P_2502 = "p_2502";		
        public static String COLUMNA_T_2502 = "t_2502";		
        public static String COLUMNA_P_2503 = "p_2503";		
        public static String COLUMNA_T_2503 = "t_2503";		
        public static String COLUMNA_P_2601 = "p_2601";	//Pregunta26
        public static String COLUMNA_T_2601 = "t_2601";
        public static String COLUMNA_P_2602 = "p_2602";	
        public static String COLUMNA_T_2602 = "t_2602";
        public static String COLUMNA_P_2603 = "p_2603";	
        public static String COLUMNA_T_2603 = "t_2603";
        public static String COLUMNA_P_2604 = "p_2604";	
        public static String COLUMNA_T_2604 = "t_2604";
        public static String COLUMNA_P_2701 = "p_2701";//Pregunta27		
        public static String COLUMNA_T_2701 = "t_2701";
        public static String COLUMNA_P_2702 = "p_2702";	
        public static String COLUMNA_T_2702 = "t_2702";
        public static String COLUMNA_P_2703 = "p_2703";	
        public static String COLUMNA_T_2703 = "t_2703";
        public static String COLUMNA_P_2801 = "p_2801";	//Pregunta28
        public static String COLUMNA_T_2801 = "t_2801";
        public static String COLUMNA_P_2802 = "p_2802";		
        public static String COLUMNA_T_2802 = "t_2802";
        public static String COLUMNA_P_2803 = "p_2803";
        public static String COLUMNA_T_2803 = "t_2803";
        public static String COLUMNA_P_2901 = "p_2901";	//Pregunta29
        public static String COLUMNA_T_2901 = "t_2901";
        public static String COLUMNA_P_2902 = "p_2902";	
        public static String COLUMNA_T_2902 = "t_2902";
        public static String COLUMNA_P_2903 = "p_2903";	
        public static String COLUMNA_T_2903 = "t_2903";
        public static String COLUMNA_P_3001 = "p_3001";//Pregunta30	
        public static String COLUMNA_T_3001 = "t_3001";
        public static String COLUMNA_P_3101 = "p_3101";	//Pregunta31
        public static String COLUMNA_T_3101 = "t_3101";
        public static String COLUMNA_P_3201 = "p_3201";	//Pregunta32
        public static String COLUMNA_T_3201 = "t_3201";
        public static String COLUMNA_P_3301 = "p_3301";	//Pregunta33	
        public static String COLUMNA_T_3301 = "t_3301";
        public static String COLUMNA_P_3401 = "p_3401";	//Pregunta34
        public static String COLUMNA_T_3401 = "t_3401";
        public static String COLUMNA_P_3501 = "p_3501";//Pregunta35	
        public static String COLUMNA_T_3501 = "t_3501";
        public static String COLUMNA_P_3601 = "p_3601";//Pregunta36	
        public static String COLUMNA_T_3601 = "t_3601";
        public static String COLUMNA_P_3701 = "p_3701";//Pregunta37		
        public static String COLUMNA_T_3701 = "t_3701";
        public static String COLUMNA_P_3801 = "p_3801";//Pregunta38		
        public static String COLUMNA_T_3801 = "t_3801";
        public static String COLUMNA_P_3901 = "p_3901";//Pregunta39		
        public static String COLUMNA_T_3901 = "t_3901";
        public static String COLUMNA_P_4001 = "p_4001";//Pregunta40		
        public static String COLUMNA_T_4001 = "t_4001";
        public static String COLUMNA_P_4101 = "p_4101";	//Pregunta41
        public static String COLUMNA_T_4101 = "t_4101";
        public static String COLUMNA_P_4102 = "p_4102";	
        public static String COLUMNA_T_4102 = "t_4102";
        public static String COLUMNA_P_4103 = "p_4103";	
        public static String COLUMNA_T_4103 = "t_4103";
        public static String COLUMNA_P_4201 = "p_4201";	//Pregunta42
        public static String COLUMNA_T_4201 = "t_4201";
        public static String COLUMNA_P_4202 = "p_4202";		
        public static String COLUMNA_T_4202 = "t_4202";
        public static String COLUMNA_P_4203 = "p_4203";	
        public static String COLUMNA_T_4203 = "t_4203";
        public static String COLUMNA_P_4204 = "p_4204";	
        public static String COLUMNA_T_4204 = "t_4204";
        public static String COLUMNA_P_4205 = "p_4205";	
        public static String COLUMNA_T_4205 = "t_4205";
        public static String COLUMNA_P_4301 = "p_4301";//Pregunta43		
        public static String COLUMNA_T_4301 = "t_4301";
        public static String COLUMNA_P_4401 = "p_4401";//Pregunta44	
        public static String COLUMNA_T_4401 = "t_4401";
        public static String COLUMNA_P_4402 = "p_4402";	
        public static String COLUMNA_T_4402 = "t_4402";
        public static String COLUMNA_P_4403 = "p_4403";		
        public static String COLUMNA_T_4403 = "t_4403";
        public static String COLUMNA_P_4501 = "p_4501";//Pregunta45	
        public static String COLUMNA_T_4501 = "t_4501";
        public static String COLUMNA_P_4502 = "p_4502";	
        public static String COLUMNA_T_4502 = "t_4502";
        public static String COLUMNA_P_4601 = "p_4601";	//Pregunta46
        public static String COLUMNA_T_4601 = "t_4601";
        public static String COLUMNA_P_4701 = "p_4701";	//Pregunta47
        public static String COLUMNA_T_4701 = "t_4701";
        public static String COLUMNA_P_4702 = "p_4702";		
        public static String COLUMNA_T_4702 = "t_4702";
        public static String COLUMNA_P_4703 = "p_4703";	
        public static String COLUMNA_T_4703 = "t_4703";
        public static String COLUMNA_P_4801 = "p_4801";//Pregunta48	
        public static String COLUMNA_T_4801 = "t_4801";
        public static String COLUMNA_P_4901 = "p_4901";//Pregunta49	
        public static String COLUMNA_T_4901 = "t_4901";
        public static String COLUMNA_P_5001 = "p_5001";	//Pregunta50	
        public static String COLUMNA_T_5001 = "t_5001";
        public static String COLUMNA_P_0815 = "p_0815"; // Resultado de la entrevista.
        public static String COLUMNA_T_0815 = "t_0815";
        public static String COLUMNA_FECHA_FIN = "fecha_fin";
        public static String COLUMNA_HORA_FIN = "hora_fin";
        public static String COLUMNA_FECHOR_FIN = "fechor_fin";
        public static String COLUMNA_LATITUD_B = "latitud_b";
        public static String COLUMNA_LONGITUD_B = "longitud_b";
        public static String COLUMNA_P72 = "p72";
        public static String COLUMNA_VIVE = "vive";
        public static String COLUMNA_TABLETA = "tableta"; // Nombre de la tableta.
        public static String COLUMNA_ENCUESTO = "encuesto"; // Nombre de la entrevistadora.
        public static String COLUMNA_CONDICION = "condicion";
        public static String COLUMNA_VERSION = "version";
    }

    private static final String CREAR_TABLA_POSICIONADOR = "create table "
    		+ TablaPosicionador.TABLA_POSICIONADOR + "("
    		+ TablaPosicionador.COLUMNA_REGISTRO + " text, "
    		+ TablaPosicionador.COLUMNA_POSICION + " text, "
    		+ TablaPosicionador.COLUMNA_TABLETA + " text, "
    		+ TablaPosicionador.COLUMNA_ENCUESTO + " text, "
    		+ TablaPosicionador.COLUMNA_REFIERE + " integer)";

    private static final String CREAR_TABLA_CUESTIONARIO_BASICO = "create table "
    		+ TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO + "("
    		+ TablaCuestionarioBasico.COLUMNA_SECUENCIA + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_REGISTRO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_CADENA + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_MUNICIPIO + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_AGEB + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_AREA + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_MANZANA + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_VIVIENDA + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_NOMBRE + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_PATERNO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_MATERNO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_NOMBRE_CO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_PATERNO_CO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_MATERNO_CO + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_SEXO + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_EDAD + " integer, "
			+ TablaCuestionarioBasico.COLUMNA_EDAD_HOY + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_FECHA + " date, "
    		+ TablaCuestionarioBasico.COLUMNA_HORA_INI + " time, "
    		+ TablaCuestionarioBasico.COLUMNA_FECHOR_INI + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_LATITUD_A + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_LONGITUD_A + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0101 + " integer, " //Pregunta1
    		+ TablaCuestionarioBasico.COLUMNA_T_0101 + " text, "
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0102 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0102 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0103 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0103 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0104 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0104 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0105 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0105 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0201 + " integer, "	//Pregunta2
    		+ TablaCuestionarioBasico.COLUMNA_T_0201 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0202 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0202 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0203 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0203 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0204 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0204 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0205 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0205 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0301 + " integer, "		//Pregunta3
    		+ TablaCuestionarioBasico.COLUMNA_T_0301 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0302 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0302 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0303 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0303 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0304 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0304 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0305 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0305 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0401 + " integer, "	//Pregunta4
    		+ TablaCuestionarioBasico.COLUMNA_T_0401 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0402 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0402 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0403 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0403 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0404 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0404 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0405 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0405 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0501 + " integer, "	//Pregunta5
    		+ TablaCuestionarioBasico.COLUMNA_T_0501 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0502 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0502 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0503 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0503 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0504 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0504 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0505 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0505 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0601 + " integer, "	//Pregunta6	
    		+ TablaCuestionarioBasico.COLUMNA_T_0601 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0602 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0602 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0603 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0603 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0604 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0604 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0605 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0605 + " text, " */
    		+ TablaCuestionarioBasico.COLUMNA_P_0701 + " integer, "//Pregunta7
    		+ TablaCuestionarioBasico.COLUMNA_T_0701 + " text, "
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0702 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0702 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0703 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0703 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0704 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0704 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0705 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0705 + " text, "*/
    		+ TablaCuestionarioBasico.COLUMNA_P_0801 + " integer, "//Pregunta8	
    		+ TablaCuestionarioBasico.COLUMNA_T_0801 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0802 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0802 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0803 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0803 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0804 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0804 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0805 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0805 + " text, "	*/	
    		+ TablaCuestionarioBasico.COLUMNA_P_0901 + " integer, "//Pregunta9	
    		+ TablaCuestionarioBasico.COLUMNA_T_0901 + " text, "		
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_0902 + " integer, "		
    		+ TablaCuestionarioBasico.COLUMNA_T_0902 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0903 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_0903 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_0904 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0904 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0905 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_0905 + " text, "*/
    		+ TablaCuestionarioBasico.COLUMNA_P_1001 + " integer, "//Pregunta10
    		+ TablaCuestionarioBasico.COLUMNA_T_1001 + " text, "
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1002 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1002 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1003 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1003 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1004 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1004 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1005 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1005 + " text, " */
    		+ TablaCuestionarioBasico.COLUMNA_P_1101 + " integer, "//Pregunta11
    		+ TablaCuestionarioBasico.COLUMNA_T_1101 + " text, "
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1102 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1102 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1103 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1103 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1104 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1104 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1105 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1105 + " text, " */
    		+ TablaCuestionarioBasico.COLUMNA_P_1201 + " integer, "//Pregunta12
    		+ TablaCuestionarioBasico.COLUMNA_T_1201 + " text, "
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1202 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1202 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_1203 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1203 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1204 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1204 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_1205 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1205 + " text, " */	
    		+ TablaCuestionarioBasico.COLUMNA_P_1301 + " integer, "//Pregunta13	
    		+ TablaCuestionarioBasico.COLUMNA_T_1301 + " text, "	
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1302 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1302 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1303 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1303 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1304 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1304 + " text, " */	
    		+ TablaCuestionarioBasico.COLUMNA_P_1401 + " integer, "	//Pregunta14
    		+ TablaCuestionarioBasico.COLUMNA_T_1401 + " text, "	
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1402 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1402 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1403 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1403 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1404 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1404 + " text, "	*/
    		+ TablaCuestionarioBasico.COLUMNA_P_1501 + " integer, "	//Pregunta15
    		+ TablaCuestionarioBasico.COLUMNA_T_1501 + " text, "	
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1502 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1502 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1503 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1503 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1504 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1504 + " text, "	*/
    		+ TablaCuestionarioBasico.COLUMNA_P_1601 + " integer, "	//Pregunta16
    		+ TablaCuestionarioBasico.COLUMNA_T_1601 + " text, "	
    	/*	+ TablaCuestionarioBasico.COLUMNA_P_1602 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1602 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1603 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1603 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1604 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1604 + " text, "	*/
    		+ TablaCuestionarioBasico.COLUMNA_P_1701 + " integer, "	//Pregunta17
    		+ TablaCuestionarioBasico.COLUMNA_T_1701 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1702 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1702 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1703 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1703 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1704 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1704 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1801 + " integer, "	//Pregunta18
    		+ TablaCuestionarioBasico.COLUMNA_T_1801 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1802 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1802 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1803 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1803 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1804 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1804 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_1901 + " integer, "	//Pregunta19
    		+ TablaCuestionarioBasico.COLUMNA_T_1901 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1902 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1902 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1903 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_1903 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_1904 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_1904 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2001 + " integer, "	//Pregunta20
    		+ TablaCuestionarioBasico.COLUMNA_T_2001 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2002 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_2002 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2101 + " integer, "	//Pregunta21
    		+ TablaCuestionarioBasico.COLUMNA_T_2101 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2102 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2102 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2103 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_2103 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2201 + " integer, "	//Pregunta22
    		+ TablaCuestionarioBasico.COLUMNA_T_2201 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2202 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_2202 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2301 + " integer, "	//Pregunta23
    		+ TablaCuestionarioBasico.COLUMNA_T_2301 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2302 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_2302 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2303 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2303 + " text, "	
    		+ TablaCuestionarioBasico.COLUMNA_P_2401 + " integer, "	//Pregunta24
    		+ TablaCuestionarioBasico.COLUMNA_T_2401 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_2402 + " integer, "	
    		+ TablaCuestionarioBasico.COLUMNA_T_2402 + " text, "		
    		+ TablaCuestionarioBasico.COLUMNA_P_2403 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2403 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2501 + " integer, "//Pregunta25
    		+ TablaCuestionarioBasico.COLUMNA_T_2501 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2502 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2502 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2503 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2503 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2601 + " integer, "//Pregunta26
    		+ TablaCuestionarioBasico.COLUMNA_T_2601 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2602 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2602 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2603 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2603 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2604 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2604 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2701 + " integer, "//Pregunta27
    		+ TablaCuestionarioBasico.COLUMNA_T_2701 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2702 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2702 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2703 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2703 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2801 + " integer, "//Pregunta28
    		+ TablaCuestionarioBasico.COLUMNA_T_2801 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2802 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2802 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2803 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2803 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2901 + " integer, "//Pregunta29
    		+ TablaCuestionarioBasico.COLUMNA_T_2901 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2902 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2902 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_2903 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_2903 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3001 + " integer, "//Pregunta30
    		+ TablaCuestionarioBasico.COLUMNA_T_3001 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3101 + " integer, "//Pregunta31
    		+ TablaCuestionarioBasico.COLUMNA_T_3101 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3201 + " integer, "//Pregunta32
    		+ TablaCuestionarioBasico.COLUMNA_T_3201 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3301 + " integer, "//Pregunta33
    		+ TablaCuestionarioBasico.COLUMNA_T_3301 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3401 + " integer, "//Pregunta34
    		+ TablaCuestionarioBasico.COLUMNA_T_3401 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3501 + " integer, "//Pregunta35
    		+ TablaCuestionarioBasico.COLUMNA_T_3501 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3601 + " integer, "//Pregunta36
    		+ TablaCuestionarioBasico.COLUMNA_T_3601 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3701 + " integer, "//Pregunta37
    		+ TablaCuestionarioBasico.COLUMNA_T_3701 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3801 + " integer, "//Pregunta38
    		+ TablaCuestionarioBasico.COLUMNA_T_3801 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_3901 + " integer, "//Pregunta39
    		+ TablaCuestionarioBasico.COLUMNA_T_3901 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4001 + " integer, "//Pregunta40
    		+ TablaCuestionarioBasico.COLUMNA_T_4001 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4101 + " integer, "//Pregunta41
    		+ TablaCuestionarioBasico.COLUMNA_T_4101 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4102 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4102 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4103 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4103 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4201 + " integer, "//Pregunta42
    		+ TablaCuestionarioBasico.COLUMNA_T_4201 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4202 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4202 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4203 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4203 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4204 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4204 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4205 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4205 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4301 + " integer, "//Pregunta43
    		+ TablaCuestionarioBasico.COLUMNA_T_4301 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4401 + " integer, "//Pregunta44
    		+ TablaCuestionarioBasico.COLUMNA_T_4401 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4402 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4402 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4403 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4403 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4501 + " integer, "//Pregunta45
    		+ TablaCuestionarioBasico.COLUMNA_T_4501 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4502 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4502 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4601 + " integer, "//Pregunta46
    		+ TablaCuestionarioBasico.COLUMNA_T_4601 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4701 + " integer, "//Pregunta47
    		+ TablaCuestionarioBasico.COLUMNA_T_4701 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4702 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4702 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4703 + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_T_4703 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4801 + " integer, "//Pregunta48
    		+ TablaCuestionarioBasico.COLUMNA_T_4801 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_4901 + " integer, "//Pregunta49
    		+ TablaCuestionarioBasico.COLUMNA_T_4901 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_5001 + " integer, "//Pregunta50
    		+ TablaCuestionarioBasico.COLUMNA_T_5001 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P_0815 + " integer, "	// Resultado de la entrevista.
    		+ TablaCuestionarioBasico.COLUMNA_T_0815 + " text, "	// Resultado de la entrevista.
    		+ TablaCuestionarioBasico.COLUMNA_FECHA_FIN + " date, "
    		+ TablaCuestionarioBasico.COLUMNA_HORA_FIN + " time, "
    		+ TablaCuestionarioBasico.COLUMNA_FECHOR_FIN + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_LATITUD_B + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_LONGITUD_B + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_P72 + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_VIVE + " integer, "
    		+ TablaCuestionarioBasico.COLUMNA_TABLETA + " text, "	// Nombre de la tableta.
    		+ TablaCuestionarioBasico.COLUMNA_ENCUESTO + " text, "	// Nombre de la entrevistadora.
    		+ TablaCuestionarioBasico.COLUMNA_CONDICION + " text, "
    		+ TablaCuestionarioBasico.COLUMNA_VERSION + " text)";

    public SQLiteOpenHelperBasico(Context context) { 
        super(context, DATABASE_NAME, null, DATABASE_VERSION); 
        // TODO Auto-generated constructor stub 
    } 
  
    @Override
    public void onCreate(SQLiteDatabase db) { 
        // TODO Auto-generated method stub 
        db.execSQL(CREAR_TABLA_POSICIONADOR); 
        db.execSQL(CREAR_TABLA_CUESTIONARIO_BASICO); 
    } 
  
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { 
        // TODO Auto-generated method stub 
        db.execSQL("delete table if exists " + TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO); 
        onCreate(db); 
    } 
}
