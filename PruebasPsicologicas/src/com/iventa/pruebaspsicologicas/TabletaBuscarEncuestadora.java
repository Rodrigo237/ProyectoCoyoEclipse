package com.iventa.pruebaspsicologicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import android.app.Activity; 
import android.content.Context;
import android.content.Intent; 
import android.os.Bundle; 
import android.os.Environment;
import android.util.Log;
import android.view.View; 
import android.view.ViewGroup;
import android.widget.AdapterView; 
import android.widget.AdapterView.OnItemClickListener; 
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
  
import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologicas.R; 

public class TabletaBuscarEncuestadora extends Activity implements OnItemClickListener { 

	private FuenteCuestionarioBasico fuenteDeCuestionarioBasico; 
    private GridView galeria;
	public String la_tableta;

    private Integer[] mThumbIds = {
    		R.drawable.encuesta_adriana_gutierrez_parra,
    		R.drawable.encuesta_america_juarez_salazar,
    		R.drawable.encuesta_ana_monserrat_lechuga_mendoza,
    		R.drawable.encuesta_andrea_gomez_luna,
    		R.drawable.encuesta_andres_martinez_martinez,
    		R.drawable.encuesta_diana_isabel_gonzalez_enciso,
    		R.drawable.encuesta_gabriela_rivera_arredondo,
    		R.drawable.encuesta_gladis_villegas_ramirez,
    		R.drawable.encuesta_irving_israel_ramirez_ramirez,
    		R.drawable.encuesto_jaqueline_lopez_lopez,
    		R.drawable.encuesta_karina_adriana_ramos_perez,
    		R.drawable.encuesta_luis_arturo_vazquez_padilla,
    		R.drawable.encuesta_misael_olivos_rivera,
    		R.drawable.encuesta_omar_santiago_perez,
    		R.drawable.encuesta_ramses_alejandro_bravo_juarez,
    		R.drawable.encuesta_roberto_fabian_pelaez_granados,
    		R.drawable.encuesta_rosario_dafne_lujan_velazquez,
    		R.drawable.encuesta_ruperto_garcia_perez,
    		R.drawable.encuesta_zaira_rebeca_martinez_vite
    };

	@SuppressWarnings("unused")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_encuestadores); 

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 
        galeria = (GridView) findViewById(R.id.galeria);

		final String[] nombre_de_encuestadora = new String[]{
				"Adriana Gutierrez Parra",
				"America Juarez Salazar",
				"Ana Montserrat Lechuga Mendoza",
				"Andrea Gomez Luna",
				"Andres Martinez Martinez",
				"Diana Isabel Gonzalez Enciso",
				"Gabriela Rivera Arredondo",
				"Gladis Villegas Ramirez",
				"Irving Israel Ramirez Ramirez",
				"Jaqueline López López",
				"Karina Adriana Ramos Perez",
				"Luis Arturo Vázquez Padilla",
				"Misael Olivos Rivera",
				"Omar Santiago Perez",
				"Ramses Alejandro Bravo Juarez",
				"Roberto Fabian Pelaez Granados",
				"Rosario Dafne Lujan Velazquez",
				"Ruperto Garcia Perez",
				"Zaira Rebeca Martinez Vite"
				};

		final String[] foto_de_encuestadora = new String[]{
				"encuesta_adriana_gutierrez_parra",
				"encuesta_america_juarez_salazar",
				"encuesta_ana_monserrat_lechuga_mendoza",
				"encuesta_andrea_gomez_luna",
				"encuesta_andres_martinez_martinez",
				"encuesta_diana_isabel_gonzalez_enciso",
				"encuesta_gabriela_rivera_arredondo",
				"encuesta_gladis_villegas_ramirez",
				"encuesta_irving_israel_ramirez_ramirez",
				"encuesto_jaqueline_lopez_lopez",
				"encuesta_karina_adriana_ramos_perez",
				"encuesta_luis_arturo_vazquez_padilla",
				"encuesta_misael_olivos_rivera",
				"encuesta_omar_santiago_perez",
				"encuesta_ramses_alejandro_bravo_juarez",
				"encuesta_roberto_fabian_pelaez_granados",
				"encuesta_rosario_dafne_lujan_velazquez",
				"encuesta_ruperto_garcia_perez",
				"encuesta_zaira_rebeca_martinez_vite"
		};

		galeria.setAdapter(new ImageAdapter(this));
		galeria.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                Toast.makeText(TabletaBuscarEncuestadora.this, "" + nombre_de_encuestadora[posicion], Toast.LENGTH_SHORT).show();

                fuenteDeCuestionarioBasico.open(); 
           		String comando_00 = "UPDATE posicionador SET";
           		String comando_01 = "  tableta = ";
           		String comando_02 = ", encuesto = ";
           		String comando_03 = ", refiere = ";

   				String el_nombre_de_tableta = "'" + leer_tableta() + "'";
   				String el_nombre_de_encuestadora = "'" + nombre_de_encuestadora[posicion] + "'";
   				Integer la_foto_de_encuestadora = mThumbIds[posicion];

           		fuenteDeCuestionarioBasico.guardarEncuestadora(comando_00,
           				comando_01, el_nombre_de_tableta,
           				comando_02, el_nombre_de_encuestadora,
           				comando_03, la_foto_de_encuestadora
        				);

                ventanaPrincipal();
            }
        });
	} // Fin de onCreate.

	public class ImageAdapter extends BaseAdapter {
	    private Context mContext;

	    public ImageAdapter(Context c) {
	        mContext = c;
	    }

	    public int getCount() {
	        return mThumbIds.length;
	    }

	    public Object getItem(int position) {
	        return null;
	    }

	    public long getItemId(int position) {
	        return 0;
	    }

	    public View getView(int position, View convertView, ViewGroup parent) {
	        ImageView imageView;
	        if (convertView == null) {  // if it's not recycled, initialize some attributes
	            imageView = new ImageView(mContext);
	            imageView.setLayoutParams(new GridView.LayoutParams(130, 170));
	            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	            imageView.setPadding(8, 8, 8, 8);
	        } else {
	            imageView = (ImageView) convertView;
	        }

	        imageView.setImageResource(mThumbIds[position]);
	        return imageView;
	    }
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	private String leer_tableta() {
		File sd = Environment.getExternalStorageDirectory();
		File f = new File(sd.getAbsolutePath(), "Tableta.txt");
		try {
			BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

			la_tableta = fin.readLine();
			fin.close();
		}
		catch (Exception ex) {
			Log.e("Ficheros", "Error al leer el archivo desde tarjeta SD");
		}
	
		return la_tableta;
	}

	public void ventanaAnterior(View v) {
		Intent i = new Intent(TabletaBuscarEncuestadora.this, MainActivity.class);
		startActivity(i);
    }

	public void ventanaPrincipal() {
		Intent i = new Intent(TabletaBuscarEncuestadora.this, MainActivity.class);
		startActivity(i);
    }
}
