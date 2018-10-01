package br.usjt.ads.desmob.clienteads18.model;

public class ClienteDAO {

    private static Cliente[] clientes;

    private ClienteDAO(){}

    public static Cliente[] getClientes(){

        if(clientes == null){

            clientes = new Cliente[6];

            clientes[0] = new Cliente(
                    1,
                    "O Filme da Minha Vida",
                    "mi_usjt.br",
                    "Selton Mello",
                    "03/02/2017",
                    "Serras Gaúchas, 1963. O jovem Tony Terranova precisa lidar com a ausência do pai," +
                            " que foi embora sem avisar à família e, desde então, não deu mais notícias ao filho." +
                            " Tony é professor de francês num colégio da cidade, convive com os conflitos dos alunos" +
                            " no início da adolescência e vive o desabrochar do amor.",
                    "76%");

            clientes[1] = new Cliente(
                    2,
                    "CARONA PARA O AMOR",
                    "da_usjt_br",
                    "Franck Dubosc",
                    "02/06/2018",
                    "Jocelyn é um empresário muito bem-sucedido, extremamente egocêntrico e egoísta, sempre disposto " +
                            "a inventar mentiras para tirar vantagem em qualquer situação promissora. Um dia, ele resolve seduzir" +
                            " uma bela mulher fingindo sofrer de uma deficiência. No entanto, fica mais difícil sustentar a farsa " +
                            "quando ele é apresentado a nova cunhada, que é realmente deficiente.",
                    "76%");

            clientes[2] = new Cliente(
                    3,
                    "Homem-Aranha ",
                    "ha_usjt.br",
                    "Jon Watts",
                    "06/05/2017",
                    "Depois de atuar ao lado dos Vingadores, chegou a hora do pequeno Peter Parker voltar para" +
                            " casa e para a sua vida, já não mais tão normal. Lutando diariamente contra pequenos crimes" +
                            " nas redondezas, ele pensa ter encontrado a missão de sua vida quando o terrível vilão Abutre" +
                            " surge amedrontando a cidade. O problema é que a tarefa não será tão fácil como ele imaginava.",
                    "98%");

            clientes[3] = new Cliente(
                    4,
                    "HOTEL TRANSILVÂNIA 3",
                    "ht_usjt.br",
                    "Genndy Tartakovsky",
                    "13/06/2018",
                    "Drácula e sua turma embarcam em um cruzeiro monstruosamente luxuoso. Mas as férias dos sonhos" +
                            " logo se transformam em um pesadelo quando Mavis percebe que Drac está se apaixonando por Ericka." +
                            " Ela é a misteriosa capitã do navio, que guarda um perigoso segredo que pode destruir completamente" +
                            " a vida de todos os monstros.",
                    "100%");

            clientes[4] = new Cliente(
                    5,
                    "Os Incríveis 2",
                    "oi_usjt.br",
                    "Brad Bird",
                    "28/05/2018",
                    "A família de super-heróis favorita de todo mundo está de volta em Os Incríveis 2. Mas desta vez" +
                            " Helena (voz de Holly Hunter) está em destaque, deixando Beto (voz de Craig T. Nelson) em casa com" +
                            " Violeta (voz de Sarah Vowell) e Flecha voz de Huck Milner) no heroísmo do dia-a-dia da vida ‘comum’.",
                    "84%");

            clientes[5] = new Cliente(
                    6,
                    "O Nome da Morte",
                    "nm_usjt.br",
                    "Henrique Goldman",
                    "02/09/2018",
                    "Júlio Santana é um pai de família, homem caridoso e um orgulho para os seus pais. No entanto, " +
                            "ele esconde outra identidade sob a fachada exemplar: ele é um assassino profissional responsável" +
                            " por 492 mortes.",
                    "59%");


        }
        return clientes;
    }
}