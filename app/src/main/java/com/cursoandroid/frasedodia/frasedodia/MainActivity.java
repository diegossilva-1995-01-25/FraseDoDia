package com.cursoandroid.frasedodia.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "O sucesso é ir de fracasso em fracasso sem perder entusiasmo. \n(Winston Churchill)",
            "O pessimista vê dificuldade em cada oportunidade; o otimista vê oportunidade em cada dificuldade. \n(Winston Churchill)",
            "A desvantagem do capitalismo é a desigual distribuição das riquezas; a vantagem do socialismo é a igual distribuição das misérias. \n(Winston Churchill)",
            "Fofocar sobre os outros é certamente um defeito, mas é uma virtude quando aplicado a si mesmo. \n(Nelson Mandela)",
            "Sonho com o dia em que todos levantar-se-ão e compreenderão que foram feitos para viverem como irmãos. \n(Nelson Mandela)",
            "A educação é a arma mais poderosa que você pode usar para mudar o mundo. \n(Nelson Mandela)",
            "Se um homem não descobriu nada pelo qual morreria, não está pronto para viver. \n(Martin Luther King Jr.)",
            "O que me preocupa não é o grito dos maus. É o silêncio dos bons. \n(Martin Luther King Jr.)",
            "Eu tenho um sonho. O sonho de ver meus filhos julgados por sua personalidade, não pela cor de sua pele. \n(Martin Luther King Jr.)",
            "A mentira é como uma bola de neve; quanto mais rola, tanto mais aumenta. \n(Martinho Lutero)",
            "No casamento, cada pessoa deve realizar a função que lhe compete. O homem deve ganhar dinheiro, a mulher deve economizar. \n(Martinho Lutero)",
            "A paz, se possível, mas a verdade, a qualquer preço. \n(Martinho Lutero)",
            "Deus tinha um único filho e fez dele um missionário. \n(David Livingstone)",
            "Deus, envia-me para qualquer lugar, desde que vás comigo. Coloca qualquer carga sobre mim, desde que me carregues, e desata todos os laços de meu coração, menos o laço que prende o meu coração ao Teu. \n(David Livingstone)",
            "Eu irei não importa aonde, contanto que seja para a frente. \n(David Livingstone)",
            "A verdade é clara como água de rocha, como liquor de quem não tem meningite séptica. \n(Enéas Carneiro)",
            "Minha mensagem é positiva, é de que o homem tem de saber, conhecer e em conhecendo ele é livre. \n(Enéas Carneiro)",
            "Alguns me perguntavam no passado: \"Por que o Sr. não vai ser ministro?\" Ministro de quê? De quê? De um governo pútrido, em decomposição franca, que não aguenta o diálogo frente a frente? \n(Enéas Carneiro)",
            "O soldado que vai à guerra e tem medo de morrer é um covarde. \n(Jair Messias Bolsonaro)",
            "O melhor programa social que o governo pode oferecer ao povo brasileiro é o emprego. \n(Jair Messias Bolsonaro)",
            "Eu sou daltônico, para mim todos tem a mesma cor. \n(Jair Messias Bolsonaro)",
            "Pior que um incrédulo, é um Cristão que Dissimula \n(Silas Malafaia)",
            "O sucesso sem Deus é fracasso. \n(Silas Malafaia)",
            "Liberdade de expressão para todo mundo dizer a mesma coisa é ditadura de opinião. \n(Silas Malafaia)",
            "Um boletim de voto tem mais força que um tiro de espingarda. \n(Abraham Lincoln)",
            "Quando pratico o bem, sinto-me bem; quando pratico o mal, sinto-me mal. Eis a minha religião. \n(Abraham Lincoln)",
            "Não te esqueças que os estranhos são amigos que ainda não conheces. \n(Abraham Lincoln)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                int anterior = -1;

                if(anterior == numeroAleatorio) {
                    numeroAleatorio = randomico.nextInt(frases.length);
                }

                anterior = numeroAleatorio;

                textoNovaFrase.setText(frases[numeroAleatorio]);

            }
        });

    }
}
