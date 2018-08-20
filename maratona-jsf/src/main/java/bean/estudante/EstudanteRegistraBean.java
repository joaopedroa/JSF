package bean.estudante;

import bean.model.Estudante;


import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

@Named

public class EstudanteRegistraBean implements Serializable {
    private Estudante estudante = new Estudante();

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }



    private String[] nomesArray = {"joao","teste","jsf"};
    private List<String>  nomesList = asList("t","t","t");

    public boolean mostrarnotas;

    public void mostraNotasAgora(){
        this.mostrarnotas = true;
    System.out.println(this.mostrarnotas);
    }

    public boolean isMostrarnotas() {
        return mostrarnotas;
    }

    public void setMostrarnotas(boolean mostrarnotas) {
        this.mostrarnotas = mostrarnotas;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public void imprimir(String nome){
        System.out.println("Testafndo " + nome );
        System.out.println("Testafndo " + nome);
        System.out.println("Testafndo " + nome);

    }


    public void calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(),value);
        System.out.println(result);
    }


    public String retornaNome(String nome){
        return "Eu sou o " + nome;
    }
    public String irPagina(String pagina){
        return pagina + "?faces-redirect=true";
    }
}
