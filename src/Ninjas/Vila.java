package Ninjas;

public class Vila {
  public static void main() {
      //Ninja1
      String Ninja1 = "Naruto";
      String missao1 = "Encontrar o bandido";
      String statusDaMissao1 = "Em andamento";
      char NivelDaMissao1 = 'B';
      int idade1 = 16;

      //Verificar nivel da missao e idade do ninja
      if (idade1 <=15) {
          if (NivelDaMissao1 == 'c' || NivelDaMissao1 == 'D') {
              statusDaMissao1 = "concluida";
          } else {
              statusDaMissao1 = "Nao concluida";
          }
      }else {
          statusDaMissao1 = "concluida";
      }

      System.out.println("------------------------------------------");

      System.out.println("Nome do Ninja: " + Ninja1);
      System.out.println("Idade do Ninja: " + idade1);
      System.out.println("Missao: " + missao1);
      System.out.println("Status da missao: " + statusDaMissao1);
      System.out.println("Nivel da missao: " + NivelDaMissao1);

      System.out.println("------------------------------------------");

      //Ninja2
      String Ninja2 = "Sasuke";
      String missao2 = "Pegar a comida do sensei";
      String statusDaMissao2 = "Em andamento";
      char NivelDaMissao2 = 'A';
      int idade2 = 14;

      //Verificar nivel da missao e idade do ninja
      if (idade2 <=15) {
          if (NivelDaMissao2 == 'c' || NivelDaMissao2 == 'D') {
              statusDaMissao2 = "concluida";
          } else {
              statusDaMissao2 = "Nao concluida";
          }
      }else {
          statusDaMissao2 = "concluida";
      }
      System.out.println("------------------------------------------");

      System.out.println("Nome do Ninja: " + Ninja2);
      System.out.println("Idade do Ninja: " + idade2);
      System.out.println("Missao: " + missao2);
      System.out.println("Status da missao: " + statusDaMissao2);
      System.out.println("Nivel da missao: " + NivelDaMissao2);

      System.out.println("------------------------------------------");

      //Ninja3
      String Ninja3 = "Itachi";
      String missao3 = "Pegue informacoes da vila";
      String statusDaMissao3 = "Missao concluida";
      char NivelDaMissao3 = 'S';
      int idade3 = 20;

      //Verificar nivel da missao e idade do ninja
      if (idade3 <=15) {
          if (NivelDaMissao3 == 'c' || NivelDaMissao3 == 'D') {
              statusDaMissao3 = "concluida";
          } else {
              statusDaMissao3 = "Nao concluida";
          }
      }else {
          statusDaMissao3 = "concluida";
      }
      System.out.println("------------------------------------------");

      System.out.println("Nome do Ninja: " + Ninja3);
      System.out.println("Idade do Ninja: " + idade3);
      System.out.println("Missao: " + missao3);
      System.out.println("Status da missao: " + statusDaMissao3);
      System.out.println("Nivel da missao: " + NivelDaMissao3);

      System.out.println("------------------------------------------");
    }
}
