import java.util.*;
import java.time.*;

class Q1 {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();

    agenda.armazenaPessoa("Ana", 17, 1.70);
    agenda.armazenaPessoa("Lara", 18, 1.60;
    System.out.println(agenda.buscaPessoa("Ana"));
    agenda.imprimeAgenda();
    agenda.imprimePessoa(1);
    agenda.removePessoa("Ana");
    agenda.imprimeAgenda();
  }
}

class Pessoa {
  private String n= "";
  private Date dataNas;
  private double h;
  private int id;

  public void setIdade(int id) {
    this.id = id;
  }

  public int getIdade() {
    return id;
  }

  public void setNome(String name) {
    this.n = name;
  }

  public void setData(Date date) {
    this.dataNas = date;
  }

  public void setAltura(double height) {
    this.h = height;
  }

  public String getNome() {
    return n;
  }

  public Date getData() {
    return dataNas;
  }

  public double getAltura() {
    return h;
  }

  public void imprime() {
    System.out.println("Nome: " + n);
    System.out.println("Nascimento: " + dataNas);
    System.out.println("Altura: " + h);
  }

  public int calcAge() {
    Calendar dateOfBirth = new GregorianCalendar();
    dateOfBirth.setTime(dataNas);
    Calendar today = Calendar.getInstance();
    int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
    this.id = age;
    return age;
  }
}

class Agenda {
  private Pessoa pessoas[] = new Pessoa[10];

  public Agenda() {
    for (int j = 0; j <= 9; j++) {
      pessoas[j] = new Pessoa();
    }
  }

  public void armazenaPessoa(String n, int id, double h) {
    for (int j = 0; j <= 9; j++) {
      if (pessoas[j].getNome() == "") {
        pessoas[j].setNome(n);
        pessoas[j].setAltura(h);
        pessoas[j].setIdade(id);
        j = 10;
      }
    }
  }

  public void removePessoa(String nome) {
    for (int i = 0; i < 10; i++) {
      if (pessoas[i].getNome() == nome) {
        pessoas[i].setNome("");
        pessoas[i].setAltura(0);
        pessoas[i].setIdade(0);
        i = 10;
      }
    }
  }

  public int buscaPessoa(String nome) {
    for (int j = 0; j < 10; j++) {
      if (pessoas[j].getNome() == n) {
        return j;
      }
    }
    return -1;
  }

  public void imprimeAgenda() {
    for (int j = 0; j < 10; j++) {
      pessoas[j].imprime();
      System.out.println("");
    }
  }

  public void imprimePessoa(int index) {
    pessoas[index].imprime();
  }
}