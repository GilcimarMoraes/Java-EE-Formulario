/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package primeiroformulario.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author gil
 */
@WebServlet(name = "ProcessaDadosClienteServlet", urlPatterns = {"/processaDadosCliente"})
public class ProcessaDadosClienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding( "UTF-8" );
        
        String nome = request.getParameter( "nome" );
        String sobrenome = request.getParameter( "sobrenome" );
        String CPF = request.getParameter( "cpf" );
        String dataNascimento = request.getParameter( "dataNasc" );
        String sexo = request.getParameter( "sexo" );
        String observacoes = request.getParameter( "observacoes" );
        
        System.out.println( "Dados do Cliente: ");
        System.out.println( "Nome: " + nome );
        System.out.println( "Sobrenome: " +sobrenome );
        System.out.println( "CPF: " + CPF );
        System.out.println( "Data Nascimento: " + dataNascimento);
        if( sexo.equals( "M" )) {
            System.out.println( "Sexo: Masculino" );
        } else {
            System.out.println( "Sexo: Feminino" );
        }
        System.out.println( "Observacoes: " + observacoes );
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "ProcessaDadosClienteServlet";
    }

}
