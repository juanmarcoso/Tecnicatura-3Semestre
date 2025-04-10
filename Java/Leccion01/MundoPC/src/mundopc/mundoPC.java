package mundopc;

import ar.com.system2025.mundopc.*;

public class mundoPC {
    
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP" );
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        // Computadora Dell (conexión cableada)
        Monitor monitorDell = new Monitor("Dell", 24);  
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");  
        Computadora computadoraDell = new Computadora("PC Dell Oficina", monitorDell, tecladoDell, ratonDell);  
        
        // Computadora Apple (inalámbrica)
        Monitor monitorApple = new Monitor("Apple", 27);  
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");  
        Raton ratonApple = new Raton("Bluetooth", "Apple");  
        Computadora computadoraMac = new Computadora("iMac Pro", monitorApple, tecladoApple, ratonApple);  
        
        // Computadora Gamer (marcas diferentes)
        Monitor monitorAsus = new Monitor("ASUS ROG", 32);  
        Teclado tecladoRazer = new Teclado("RGB Mechanical", "Razer");  
        Raton ratonLogitech = new Raton("Wireless Gaming", "Logitech");  
        Computadora pcGamer = new Computadora("PC Gamer Elite", monitorAsus, tecladoRazer, ratonLogitech);  
        
        // Computadora Lenovo (monitor pequeño)
        Monitor monitorLenovo = new Monitor("Lenovo", 15);  
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");  
        Raton ratonLenovo = new Raton("USB", "Lenovo");  
        Computadora laptopDock = new Computadora("Lenovo ThinkPad Dock", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        // Computadora Samsung (todo Samsung)
        Monitor monitorSamsung = new Monitor("Samsung Odyssey", 34);  
        Teclado tecladoSamsung = new Teclado("Bluetooth Slim", "Samsung");  
        Raton ratonSamsung = new Raton("Bluetooth Ergonómico", "Samsung");  
        Computadora setupSamsung = new Computadora("Samsung All-in-One", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        // Computadora Acer (configuración básica)
        Monitor monitorAcer = new Monitor("Acer", 21.5);  
        Teclado tecladoAcer = new Teclado("USB", "Acer");  
        Raton ratonAcer = new Raton("USB", "Acer");  
        Computadora computadoraAcer = new Computadora("Acer Aspire", monitorAcer, tecladoAcer, ratonAcer);  
        
        // Computadora MSI (gama alta, periféricos inalámbricos)
        Monitor monitorMSI = new Monitor("MSI Optix", 27);  
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");  
        Raton ratonMSI = new Raton("Bluetooth", "MSI");  
        Computadora pcMSI = new Computadora("MSI Gaming Pro", monitorMSI, tecladoMSI, ratonMSI);  
        
        // Computadora Xiaomi (diseño minimalista)
        Monitor monitorXiaomi = new Monitor("Xiaomi Mi", 23.8);  
        Teclado tecladoXiaomi = new Teclado("Bluetooth Slim", "Xiaomi");  
        Raton ratonXiaomi = new Raton("Bluetooth", "Xiaomi");  
        Computadora setupXiaomi = new Computadora("Xiaomi Office Edition", monitorXiaomi, tecladoXiaomi, ratonXiaomi); 
        
        // Computadora LG (monitor ultra ancho)
        Monitor monitorLG = new Monitor("LG UltraWide", 34);  
        Teclado tecladoLG = new Teclado("USB Ergonómico", "LG");  
        Raton ratonLG = new Raton("USB", "LG");  
        Computadora computadoraLG = new Computadora("LG Workstation", monitorLG, tecladoLG, ratonLG); 
        
        // Computadora Huawei (todo en uno)
        Monitor monitorHuawei = new Monitor("Huawei MateView", 28.2);  
        Teclado tecladoHuawei = new Teclado("Bluetooth", "Huawei");  
        Raton ratonHuawei = new Raton("Bluetooth", "Huawei");  
        Computadora allInOneHuawei = new Computadora("Huawei MateStation", monitorHuawei, tecladoHuawei, ratonHuawei);  
        
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMac);
        orden1.agregarComputadora(pcGamer);
        orden1.agregarComputadora(laptopDock);
        orden1.agregarComputadora(setupSamsung);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(pcMSI);
        orden1.agregarComputadora(setupXiaomi);
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraHP);
        orden2.agregarComputadora(allInOneHuawei);
        
        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas: ", monitorHP, tecladoLenovo, ratonSamsung );
        
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        
        
    }
    
}
