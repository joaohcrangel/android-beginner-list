package br.curso.listasimples;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.curso.models.Pessoa;

public class MainActivity extends ListActivity {
	
	private Context context;
	private List<Pessoa> pessoas;
	private ArrayAdapter<Pessoa> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		context = getBaseContext();
		
		pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Messi", 73, 27));
		pessoas.add(new Pessoa(2, "Ronaldo", 250, 37));
		pessoas.add(new Pessoa(3, "Neymar", 70, 22));
	
		adapter = new ArrayAdapter<Pessoa>(context, android.R.layout.simple_list_item_1, pessoas);
		
		ListView list = getListView();
		
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				Pessoa p = pessoas.get(position);
				
				
				
				Intent i = new Intent(context, EditarActivity.class);
				
				Bundle b = new Bundle();
				b.putString("nome", p.getNome());
				b.putInt("idade", p.getIdade());
				b.putFloat("peso", p.getPeso());
				
				i.putExtras(b);
				
				startActivity(i);
				
			}
			
		});
		
	}


}
