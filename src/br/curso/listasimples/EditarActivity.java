package br.curso.listasimples;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;

public class EditarActivity extends Activity {

	private Context context;
	private EditText input_nome;
	private EditText input_idade;
	private EditText input_peso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_editar);
		
		context = getBaseContext();
		input_nome = (EditText)findViewById(R.id.input_nome);
		input_idade = (EditText)findViewById(R.id.input_idade);
		input_peso = (EditText)findViewById(R.id.input_peso);
		
		Bundle b = getIntent().getExtras();
		
		if(b != null){
			
			input_nome.setText(b.getString("nome"));
			input_idade.setText(String.valueOf(b.getInt("idade")));
			input_peso.setText(String.valueOf(b.getFloat("peso")));
			
		}
		
	}
	
}
