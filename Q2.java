import java.util.*;
import java.time.*;

public class Q2 {
  public static void main(String args[]) {

    Empresa swat = new Empresa("swat", "555.479.351");
    swat.CriarDepartamento("Dep1");
    swat.CriarDepartamento("Financias");
    swat.AdicionarFunc("Dep1", "Nilse", 3000, new Date());
    swat.AdicionarFunc("Financias", "Jorginho Calarrara", 10000, new Date());
  }
}
Empresa {
  private String name;
  private String CNPJ; // usar "-" e "."
  private Departamento departs[] = new Departamento[10];

  public Empresa(String name, String CNPJ) {
    this.name = name;
    this.CNPJ = CNPJ;
  }

  public void CriarDepartamento(String nDep) {
    int k;
    for (k = 0; k <= 9; k++) {
      if (departs[k] == null) {
        departs[k] = new Departamento(nDep);
        k = 11;
      }
    }
    if (k == 10) {
      System.out.println("Limite atingido!");
    }
  }

  public void AdicionarFunc(String nDep, String name, double s, Date data) {
    for (int k = 0; k <= 9; k++) {
      if (departs[k].getNome() == nDep) {
        departs[k].AdicionarFuncionario(name, s, data);
      }
    }
  }
}

class Departamento {
  private String name;
  private Funcionario funcs[] = new Funcionario[100];

  public Departamento(String nDep) {
    this.name = nDep;
  }

  public String getNome() {
    return name;
  }

  public void AdicionarFuncionario(String name, double s, Date data) {
    int k;
    for (k = 0; k <= 100; k++) {
      if (funcs[k] == null) {
        funcs[k] = new Funcionario(name, s, data);
        k = 102;
      }
    }
    if (k == 102) {
      System.out.println("Limite de funcionarios por departamento atingido!");
    }
  }
}

class Funcionario {
  private String name;
  private double s;
  private Date dataE;

  public Funcionario(String name, double s, Date data) {
    this.name = name;
    this.s = s;
    this.dataE = data;
  }

}
class