/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc;


import br.edu.satc.Enum.ProdutosPreCadastrados;
import br.edu.satc.Objetos.Cliente;

import br.edu.satc.Objetos.Produto;
import br.edu.satc.Objetos.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author eduarda.178517
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
  ArrayList<Produto> produto  = new ArrayList<>();
  ArrayList<Cliente> clientes  = new ArrayList<>();
  ArrayList<Venda> Vendas  = new ArrayList<>();
  
  int escMenu=0;
  
  do{ 
     escMenu=Integer.parseInt(JOptionPane.showInputDialog("escolha sua opção\n"
             +"1. Cadastrar Cliente \n"
             +"2. Cadastrar Venda \n"
             +"3. Cadastrar Produto \n"
             + "4.Pesquisar Cliente \n"
             + "5. Pesquisar Produto \n"
             + "6. Pesquisar Vendas \n"
             + "7. Produtos pre cadastrados\n"
             +"8.sair"));
     
      switch (escMenu){  
          case 1:{
          
        
       int id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do cliente"));
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date dataCadastro = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimeto do cliente"));
       String status = JOptionPane.showInputDialog("Informe o status");
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente"));
        
          } break;
          case 2:{
          
        
        String cliente = JOptionPane.showInputDialog("Informe o cliente");
        float totalAPagar = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a pagar"));
        String statusvenda = JOptionPane.showInputDialog("Informe o status da venda");
        int idvenda = Integer.parseInt(JOptionPane.showInputDialog("Informe o id das vendas"));
        
                }break;
          case 3:{
              
          int idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do Produto"));
          String nomeProduto=JOptionPane.showInputDialog("Informe o nome do produto");
          String Descricao =JOptionPane.showInputDialog("Informe a descrição do produto");
          double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
          String statusproduto = JOptionPane.showInputDialog("Informe o status do produto");
          
          }break;
          
          case 4:{
              int pesquisarCliente = Integer.parseInt(JOptionPane.showInputDialog("qual cliente vc desejapesquisar?"));
          clientes.get(pesquisarCliente);
          JOptionPane.showConfirmDialog(null,clientes.get(pesquisarCliente));
              
          }break;
          case 5:{int pesquisarProduto = Integer.parseInt(JOptionPane.showInputDialog("qual produto vc desejapesquisar?"));
          clientes.get(pesquisarProduto);
          JOptionPane.showConfirmDialog(null,clientes.get(pesquisarProduto));
          
          }break;
          
          case 6:{int pesquisarVendas = Integer.parseInt(JOptionPane.showInputDialog("qual Vendas vc desejapesquisar?"));
          clientes.get(pesquisarVendas);
          JOptionPane.showConfirmDialog(null,clientes.get(pesquisarVendas));
          
          }break;
    
          case 7 :{
              String produtos="";
              for (ProdutosPreCadastrados m : ProdutosPreCadastrados.values()) {
                  produtos += m.getNome() + "\n";
              }
          JOptionPane.showMessageDialog(null, produtos);
          
          
                   
                   
                   
                   
                   
                   
          
          }
          
          
          
          
          
          
          }
   
      
  
                }while (escMenu!=8);  
        
        
        
}
      
}
        
        

    

