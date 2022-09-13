package com.atacama.twittelumapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class TweetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet)

        val botao = findViewById<Button>(R.id.criar_tweet)
        botao.setOnClickListener(View.OnClickListener { publicaTweet() })
    }
    private fun publicaTweet(){
        val campoDeMensagemDoTweet = findViewById<EditText>(R.id.tweet_mensagem)
        val mensagemDoTweet : String = campoDeMensagemDoTweet.text.toString()
        Toast.makeText(this, mensagemDoTweet, Toast.LENGTH_LONG).show()
        Log.i("tweet", "Botão clicado")
    }
}

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val binding = ActivityListaBinding.inflate(LayoutInflater1)
        setContentView(binding.root)

        val tweets: List<String> = listOf("Meu Tweet 1","Meu Tweet 2", "Meu Tweet 3", "Meu Tweet 4", "Meu Tweet 5")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tweets)
        binding.listaTweet.adapter = adapter
    }
}
/*
        setContentView(R.layout.activity_lista)
        val listView = findViewById<ListView>(R.id.lista_tweets)
        val lista_tweets.adapter = adapter*/

class ActivityListaBinding {

}

class NossaActivity : AppCompatActivity(){
    override fun onCreate(bundle : Bundle?){
        super.onCreate(bundle)

        val listView = binding.lista_tweets

    }
}

