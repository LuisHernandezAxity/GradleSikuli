import com.sun.tools.javac.Main;

import org.sikuli.script.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test1 {

   private static final Pattern InicioWindows = new Pattern(Main.class.getClassLoader().getResource("InicioWindows.png"));
   private static final Pattern equipo = new Pattern(Main.class.getClassLoader().getResource("Equipo.png"));
   private static final Pattern rutaBusqueda = new Pattern(Main.class.getClassLoader().getResource("rutaBusqueda.png"));
   private static final Pattern scrollCarpeta = new Pattern(Main.class.getClassLoader().getResource("scrollCarpeta.png"));
   private static final Pattern scrollAbajo = new Pattern(Main.class.getClassLoader().getResource("scrollAbajo.png"));
   private static final Pattern existeScroll = new Pattern(Main.class.getClassLoader().getResource("existeScroll.png"));
   private static final Pattern wordSikuli = new Pattern(Main.class.getClassLoader().getResource("wordSikuli.png"));
   private static final Pattern esperaWord = new Pattern(Main.class.getClassLoader().getResource("esperaWord.png"));
   private static final Pattern NombreWord = new Pattern(Main.class.getClassLoader().getResource("NombreWord.png"));

   public static void main (String[] args) throws FindFailed, InterruptedException {
        Screen screen= new Screen();

        

 //Abre una aplicacion
       /*App.open("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
       App.close("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");*/

 //Presionas las teclas windows + E
        /*screen.keyDown(Key.WIN);
        screen.keyDown(KeyEvent.VK_E);
        screen.keyUp(KeyEvent.VK_E);
        screen.keyUp(Key.WIN);*/

 //Dar clic en imagen de inicio de windows
       /*screen.click(InicioWindows);
        screen.click(equipo);
        screen.wait(rutaBusqueda,2).click();
        screen.type("C:\\Users\\lsanabria\\Desktop\\Oxxo");
        screen.type(Key.ENTER);*/

/*if (screen.exists(existeScroll) !=null) {

//Crea una region donde buscar un elemento
    Region region = screen.grow(-680, -100, -150, -100);
    //region.highlight();

//Mover el scroll hacia abajo sobre la region indicada
    region.dragDrop(scrollCarpeta, scrollAbajo);
}*/

        /*screen.doubleClick(wordSikuli);
        screen.wait(esperaWord,3);
        screen.type("e",Key.CTRL);
        screen.type(Key.DELETE);
        screen.type("ESCRITO CON SIKULI");*/

//Captura de pantalla
/*       try {
      // Obtiene la fecha actual
           Date fechaActual = new Date();
      // Define el formato de fecha deseado (por ejemplo, "yyyyMMdd_HHmmss")
           SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yy_HHmm");
      // Formatea la fecha actual como una cadena
           String fechaFormateada = formatoFecha.format(fechaActual);
           String rutaGuardar = "C:\\Users\\lsanabria\\Desktop\\Oxxo\\SikulixDemo\\CaptureScreen\\";
      // Nombre de archivo con la fecha
           String nombreArchivo =rutaGuardar + "captura_" + fechaFormateada + ".png";
      // Crea un objeto Robot para capturar la pantalla
           Robot robot = new Robot();
           Rectangle pantalla = new Rectangle(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
           BufferedImage captura = robot.createScreenCapture(pantalla);

      // Guarda la imagen con el nombre con la fecha
           ImageIO.write(captura, "png", new File(nombreArchivo));

       } catch (Exception e) {
           e.printStackTrace();
       }*/

//Extraer texto
    /*  screen.type(Key.WIN);
      screen.wait(equipo,2);
      screen.type("WORD");
      screen.type(Key.ENTER);
      screen.hover(NombreWord);
      Region regionNombreWord = new Region(1210,10, 180,30);
         //regionNombreWord.highlight();
      String extraeTexto = regionNombreWord.text();
      System.out.println("Textoextraído: "+extraeTexto);*/
    }
}
