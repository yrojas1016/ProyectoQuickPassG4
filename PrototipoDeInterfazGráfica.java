package prototipodeinterfazgráfica;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author games
 */
public class PrototipoDeInterfazGráfica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String Menu, Seleccion, Nombre, Tipo_Acceso, Quickpass1, Acceso, Registro; 
       int Opcion = 0,Quickpass ;
       
       //Utilizamos un bucle do-While para repetir el menú hasta que el usuario
       //decida salirse del programa.
       do{ 
          Menu = "******* Control de acceso del condominio Valhalla *******\n"
                +"1. Registrar el acceso. \n"
                +"2. Consultar el acceso. \n"
                +"3. Salir. \n"
                +"Selecciones alguna de las opciones: ";
          
          //Igualamos la variable Seleccion con null,esto como forma de prevenir
          //errores y cerrar el programa de forma segura cuando el usuario cancela la ventana.
          Seleccion =JOptionPane.showInputDialog(null, Menu, "Menú principal",JOptionPane.QUESTION_MESSAGE);
          if (Seleccion == null) break;
          Opcion = Integer.parseInt(Seleccion);
                 
          //Ingresamos al usuario en un switch-case para decidir qué acción 
          //ejecutar según la opción que el usuario elija en el menú.
          
         switch (Opcion){
             case 1:
          Nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
          Tipo_Acceso = JOptionPane.showInputDialog(null, "Ingrese cuál tipo de acceso posee: \n"
                  + "(Propietario, Residente, Inquilino):" );
          Quickpass1 = JOptionPane.showInputDialog(null,"Ingrese su código de Quickpass" );
          Quickpass = Integer.parseInt(Quickpass1);
          
          if (Quickpass > 1000 ) {
              Acceso = "Acceso permitido";
          }else {
              Acceso = "Acceso Denegado";
          }
           
          Registro = "******* Registro de acceso del condominio Valhalla *******\n"
                  + "Nombre: " + Nombre + "\n"
                  + "Tipo: " + Tipo_Acceso + "\n"
                  + "Quickpass : " + Quickpass + "\n"
                  + "Resultado :" + Acceso;
          
          JOptionPane.showMessageDialog(null, "Este es el resultado: " + Registro, "Registro",JOptionPane.INFORMATION_MESSAGE);
          break;
          
          
         
        case 2:
         // Como aún no usaremos arreglos mostramos este mensaje porque no podemos
         // guardar información de las personas que se registran.  
        JOptionPane.showMessageDialog(null, "Historial no disponible ","Consulta de Registro", JOptionPane.INFORMATION_MESSAGE);
        break;
        
        case 3:   
        JOptionPane.showMessageDialog(null, "Cerrando sistema... ¡Chao!","Salida del sistema", JOptionPane.INFORMATION_MESSAGE);
        break;   
           
        default:
        JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo","Error", JOptionPane.ERROR_MESSAGE);
  
         }
        
       }while (Opcion!=3);
       
       } 
    }
    
