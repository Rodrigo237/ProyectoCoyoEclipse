package com.iventa.pruebaspsicologicas;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.iventa.pruebaspsicologicas.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologicas.clases.ClasesIndividual;

@SuppressWarnings("unused")
public class TabletaBuscarCuestionario extends Activity implements OnItemClickListener { 
	private int requestCode = 1; 
	private ListView listaBasico; 
	private TextView monitor_01;
	private TextView monitor_02;
	private FuenteCuestionarioBasico fuenteDeCuestionarioBasico; 
	private TextView textoMunicipio; 
	private TextView textoAgeb;
	private TextView textoArea;
	private TextView textoManzana;
	private TextView textoVivienda;
	private TextView textoNombre;
	private TextView textoPaterno;
	private TextView textoMaterno;
	private EditText campoMunicipio; 
	private EditText campoAgeb; 
	private EditText campoArea; 
	private EditText campoManzana; 
	private EditText campoVivienda; 
	private EditText campoNombre; 
	private EditText campoPaterno; 
	private EditText campoMaterno; 
	private String campo_municipio;
	private String campo_ageb;
	private String campo_area;
	private String campo_manzana;
	private String campo_vivienda;
	private String campo_nombre;
	private String campo_paterno;
	private String campo_materno;
	private Integer longitud;
	private String el_registro;
	private String comando_SQL;
	private Button botonLimpiarCampos;
	private Button botonContinuarCuestionario;
	private CheckBox caja_ocultar;
	private Integer ancho_de_pantalla;
	private Integer ancho_de_textos;
	private Integer ancho_de_campos;

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_buscar_cuestionarios); 

		ancho_de_pantalla = getResources().getDisplayMetrics().widthPixels;

		textoMunicipio				= (TextView) findViewById(R.id.textoMunicipio);
		textoAgeb					= (TextView) findViewById(R.id.textoAgeb);
		textoArea					= (TextView) findViewById(R.id.textoArea);
        textoManzana				= (TextView) findViewById(R.id.textoManzana);
        textoVivienda				= (TextView) findViewById(R.id.textoVivienda);
        textoNombre					= (TextView) findViewById(R.id.textoNombre);
        textoPaterno				= (TextView) findViewById(R.id.textoPaterno);
        textoMaterno				= (TextView) findViewById(R.id.textoMaterno);
		campoMunicipio				= (EditText) findViewById(R.id.campoMunicipio);
		campoAgeb					= (EditText) findViewById(R.id.campoAgeb);
		campoArea					= (EditText) findViewById(R.id.campoArea);
		campoManzana				= (EditText) findViewById(R.id.campoManzana);
		campoVivienda				= (EditText) findViewById(R.id.campoVivienda);
		campoNombre					= (EditText) findViewById(R.id.campoNombre);
		campoPaterno				= (EditText) findViewById(R.id.campoPaterno);
		campoMaterno				= (EditText) findViewById(R.id.campoMaterno);
		listaBasico					= (ListView) findViewById(R.id.listaBasico);
        monitor_01					= (TextView) findViewById(R.id.monitor_01);
        monitor_02					= (TextView) findViewById(R.id.monitor_02);
        caja_ocultar				= (CheckBox) findViewById(R.id.caja_ocultar);
        botonLimpiarCampos			= (Button) findViewById(R.id.botonLimpiarCampos);
		botonContinuarCuestionario	= (Button) findViewById(R.id.botonContinuarCuestionario);

		ancho_de_textos = (ancho_de_pantalla - 60) / 5;
		textoMunicipio.setWidth(ancho_de_textos);
		textoAgeb.setWidth(ancho_de_textos);
		textoArea.setWidth(ancho_de_textos);
		textoManzana.setWidth(ancho_de_textos);
		textoVivienda.setWidth(ancho_de_textos);

		ancho_de_textos = (ancho_de_pantalla - 20) / 3;
		textoNombre.setWidth(ancho_de_textos);
		textoPaterno.setWidth(ancho_de_textos);
		textoMaterno.setWidth(ancho_de_textos);

		ancho_de_campos = (ancho_de_pantalla - 60) / 5;
		campoMunicipio.setWidth(ancho_de_campos);
		campoAgeb.setWidth(ancho_de_campos);
		campoArea.setWidth(ancho_de_campos);
		campoManzana.setWidth(ancho_de_campos);
		campoVivienda.setWidth(ancho_de_campos);

		ancho_de_campos = (ancho_de_pantalla - 20) / 3;
		campoNombre.setWidth(ancho_de_campos);
		campoPaterno.setWidth(ancho_de_campos);
		campoMaterno.setWidth(ancho_de_campos);

        campoMunicipio.setNextFocusDownId(R.id.campoAgeb);
        campoAgeb.setNextFocusDownId(R.id.campoArea);
        campoArea.setNextFocusDownId(R.id.campoManzana);
        campoManzana.setNextFocusDownId(R.id.campoVivienda);
        campoVivienda.setNextFocusDownId(R.id.campoNombre);
        campoNombre.setNextFocusDownId(R.id.campoPaterno);
        campoPaterno.setNextFocusDownId(R.id.campoMaterno);
        campoMaterno.setNextFocusDownId(R.id.campoMunicipio);

		campoMunicipio.setBackgroundColor(Color.WHITE);
		campoMunicipio.setTextColor(Color.RED);
		campoAgeb.setBackgroundColor(Color.WHITE);
		campoAgeb.setTextColor(Color.RED);
		campoArea.setBackgroundColor(Color.WHITE);
		campoArea.setTextColor(Color.RED);
		campoManzana.setBackgroundColor(Color.WHITE);
		campoManzana.setTextColor(Color.RED);
		campoVivienda.setBackgroundColor(Color.WHITE);
		campoVivienda.setTextColor(Color.RED);
		campoNombre.setBackgroundColor(Color.WHITE);
		campoNombre.setTextColor(Color.RED);
		campoPaterno.setBackgroundColor(Color.WHITE);
		campoPaterno.setTextColor(Color.RED);
		campoMaterno.setBackgroundColor(Color.WHITE);
		campoMaterno.setTextColor(Color.RED);

		caja_ocultar.setChecked(true);
		botonLimpiarCampos.setVisibility(-1);
        botonContinuarCuestionario.setVisibility(-1);
		mostrarCuestionarios();

        campoMunicipio.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

		        if (campoMunicipio.length() == 0) {
					campoMunicipio.setBackgroundColor(Color.WHITE);
					campoMunicipio.setTextColor(Color.RED);
				}

				if (campoMunicipio.length() > 0) {
					campoMunicipio.setBackgroundColor(Color.YELLOW);
					campoMunicipio.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoAgeb.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoAgeb.length() == 0) {
					campoAgeb.setBackgroundColor(Color.WHITE);
					campoAgeb.setTextColor(Color.RED);
				}

				if (campoAgeb.length() > 0) {
					campoAgeb.setBackgroundColor(Color.YELLOW);
					campoAgeb.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoArea.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

		
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoArea.length() == 0) {
					campoArea.setBackgroundColor(Color.WHITE);
					campoArea.setTextColor(Color.RED);
				}

				if (campoArea.length() > 0) {
					campoArea.setBackgroundColor(Color.YELLOW);
					campoArea.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoManzana.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoManzana.length() == 0) {
					campoManzana.setBackgroundColor(Color.WHITE);
					campoManzana.setTextColor(Color.RED);
				}

				if (campoManzana.length() > 0) {
					campoManzana.setBackgroundColor(Color.YELLOW);
					campoManzana.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoVivienda.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoVivienda.length() == 0) {
					campoVivienda.setBackgroundColor(Color.WHITE);
					campoVivienda.setTextColor(Color.RED);
				}

				if (campoVivienda.length() > 0) {
					campoVivienda.setBackgroundColor(Color.YELLOW);
					campoVivienda.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoNombre.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoNombre.length() == 0) {
					campoNombre.setBackgroundColor(Color.WHITE);
					campoNombre.setTextColor(Color.RED);
				}

				if (campoNombre.length() > 0) {
					campoNombre.setBackgroundColor(Color.YELLOW);
					campoNombre.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoPaterno.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoPaterno.length() == 0) {
					campoPaterno.setBackgroundColor(Color.WHITE);
					campoPaterno.setTextColor(Color.RED);
				}

				if (campoPaterno.length() > 0) {
					campoPaterno.setBackgroundColor(Color.YELLOW);
					campoPaterno.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        campoMaterno.addTextChangedListener(new TextWatcher() {
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub				
			}

			
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
			}

			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
		        botonLimpiarCampos.setVisibility(1);
		        caja_ocultar.setVisibility(1);

				if (campoMaterno.length() == 0) {
					campoMaterno.setBackgroundColor(Color.WHITE);
					campoMaterno.setTextColor(Color.RED);
				}

				if (campoMaterno.length() > 0) {
					campoMaterno.setBackgroundColor(Color.YELLOW);
					campoMaterno.setTextColor(Color.BLACK);
				}

				buscarCuestionario();
			}
        });

        caja_ocultar.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				buscarCuestionario();
			}
		});
	} // Fin de onCreate

	public void mostrarCuestionarios() {
		fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 
		fuenteDeCuestionarioBasico.open(); 

        comando_SQL = "SELECT registro, cadena, municipio, ageb, area, manzana, vivienda, " +
        						"nombre, paterno, materno, sexo, edad, edad_hoy, p72, p_0815, p_999 " +
        						"FROM cuestionariobasico";

        if (caja_ocultar.isChecked()) {
        	comando_SQL = comando_SQL + " WHERE p_0815 NOT IN (2,4,7)";
        }

        List<ClasesIndividual> listaDeBasico = fuenteDeCuestionarioBasico.buscaVariosRegistros(comando_SQL); 
		ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeBasico); 

		listaBasico.setAdapter(adapter);
		listaBasico.setOnItemClickListener(this);
		listaBasico.setDivider(new ColorDrawable(0xFFDDDDDD));
		listaBasico.setDividerHeight(4);
	}

	public void buscarCuestionario() {
        campo_municipio	= campoMunicipio.getText().toString();
        campo_ageb		= campoAgeb.getText().toString();
        campo_area		= campoArea.getText().toString();
        campo_manzana	= campoManzana.getText().toString();
        campo_vivienda	= campoVivienda.getText().toString();
        campo_nombre	= campoNombre.getText().toString();
        campo_paterno	= campoPaterno.getText().toString();
        campo_materno	= campoMaterno.getText().toString();

        comando_SQL = "SELECT registro, cadena, municipio, ageb, area, manzana, vivienda, " +
        						"nombre, paterno, materno, sexo, edad, edad_hoy, p72, p_0815, p_999 " +
        						"FROM cuestionariobasico WHERE ";

        if (campo_municipio.length() > 0) {
			comando_SQL = comando_SQL + "municipio = " + campo_municipio + " AND ";
		}

        if (campo_ageb.length() > 0) {
			comando_SQL = comando_SQL + "ageb = " + campo_ageb + " AND ";
		}

        if (campo_area.length() > 0) {
			comando_SQL = comando_SQL + "area = " + campo_area + " AND ";
		}

        if (campo_manzana.length() > 0) {
			comando_SQL = comando_SQL + "manzana = " + campo_manzana + " AND ";
		}

        if (campo_vivienda.length() > 0) {
			comando_SQL = comando_SQL + "vivienda = " + campo_vivienda + " AND ";
		}

        if (campo_nombre.length() > 0) {
			comando_SQL = comando_SQL + "nombre LIKE '%" + campo_nombre + "%' AND ";
		}

        if (campo_paterno.length() > 0) {
			comando_SQL = comando_SQL + "paterno LIKE '%" + campo_paterno + "%' AND ";
		}

        if (campo_materno.length() > 0) {
			comando_SQL = comando_SQL + "materno LIKE '%" + campo_materno + "%' AND ";
        }

        if (caja_ocultar.isChecked()) {
        	comando_SQL = comando_SQL + "p_0815 NOT IN (2,4,7) AND ";
        }

        longitud = comando_SQL.length();
        comando_SQL = comando_SQL.substring(0, longitud - 5);

		fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 
		fuenteDeCuestionarioBasico.open(); 

		List<ClasesIndividual> listaDeBasico = fuenteDeCuestionarioBasico.buscaVariosRegistros(comando_SQL); 
		ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeBasico); 

		listaBasico.setAdapter(adapter); 
		listaBasico.setOnItemClickListener(this); 
	}

	public void limpiarCampos(View v) {
        botonLimpiarCampos.setVisibility(-1);
    	campoMunicipio.setText("");
    	campoMunicipio.requestFocus();
    	campoAgeb.setText("");
    	campoArea.setText("");
    	campoManzana.setText("");
    	campoVivienda.setText("");
    	campoNombre.setText("");
    	campoPaterno.setText("");
    	campoMaterno.setText("");
        listaBasico.setAdapter(null);

//    	comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
//								"nombre, paterno, materno, sexo, edad, fechatoma, p72, vive " +
//								"FROM cuestionariobasico WHERE municipio = 0 ";
//
//    	fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this); 
//    	fuenteDeCuestionarioBasico.open(); 
//
//		List<ClasesIndividual> listaDeBasico = fuenteDeCuestionarioBasico.buscaVariosRegistros(comando_SQL); 
//        ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeBasico); 
//
//        listaBasico.setAdapter(adapter);
//        monitor_01.setText("Localizados = " + String.valueOf(listaBasico.getCount()));
//        fuenteDeCuestionarioBasico.close(); 
	}

	public void continuarCuestionario(View v) {
    	fuenteDeCuestionarioBasico.fijarRegistroPosicionador(el_registro);

    	String comando_0 = "SELECT p_0101 FROM cuestionariobasico WHERE registro = " + "'" + el_registro + "'";
		String identificacion[] = fuenteDeCuestionarioBasico.iniciarCuestionario(comando_0);

		Intent i = new Intent(TabletaBuscarCuestionario.this, CuestionarioSeleccion.class);
		startActivity(i);
	} // Fin de continuarCuestionario

	
	public void onItemClick(final AdapterView<?> adapterView, View view, int renglon, long id) { 
		fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
		fuenteDeCuestionarioBasico.open();

    	String elrenglon = String.valueOf(adapterView.getItemIdAtPosition(renglon));
		String matriz[] = fuenteDeCuestionarioBasico.buscaMatriz(comando_SQL, elrenglon);

		el_registro =			matriz[0].toString();
		campoMunicipio.setText(	matriz[2].toString());
		campoAgeb.setText(		matriz[3].toString());
		campoArea.setText(		matriz[4].toString());
		campoManzana.setText(	matriz[5].toString());
		campoVivienda.setText(	matriz[6].toString());
		campoNombre.setText(	matriz[7].toString());
		campoPaterno.setText(	matriz[8].toString());
		campoMaterno.setText(	matriz[9].toString());

		botonContinuarCuestionario.setVisibility(1);
  } 

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) { 
		// TODO Auto-generated method stub 
		super.onActivityResult(requestCode, resultCode, data); 
		if (requestCode == this.requestCode && resultCode == RESULT_OK) { 
			// Actualizar el Adapter 
			fuenteDeCuestionarioBasico.open(); 
			refrescarLista(); 
		}
	}

	private void refrescarLista() { 
		List<ClasesIndividual> listaDeBasico = fuenteDeCuestionarioBasico.buscaVariosRegistros(comando_SQL); 
		ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this, 
													android.R.layout.simple_list_item_1, listaDeBasico); 
		listaBasico.setAdapter(adapter); 
	}

	@Override
	protected void onPause() { 
		// TODO Auto-generated method stub 
		fuenteDeCuestionarioBasico.close(); 
		super.onPause(); 
	}

	@Override
	protected void onResume() { 
		// TODO Auto-generated method stub 
		fuenteDeCuestionarioBasico.open(); 
		super.onResume(); 
	}

	public void ventanaAnterior(View v) {
		Intent i = new Intent(TabletaBuscarCuestionario.this, MainActivity.class);
		startActivity(i);
    }
} // Fin de TabletaBuscarCuestionario
