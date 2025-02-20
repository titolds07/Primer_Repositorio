import java.awt.*;
import java.util.Random;

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            while (true) {
                // Obtiene la posición actual del mouse
                PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                Point currentLocation = pointerInfo.getLocation();

                // Genera un pequeño desplazamiento aleatorio
                int newX = currentLocation.x + random.nextInt(21) - 10; // Movimiento entre -10 y +10 píxeles
                int newY = currentLocation.y + random.nextInt(21) - 10;

                // Mueve el mouse a la nueva posición
                robot.mouseMove(newX, newY);

                // Espera antes de moverlo de nuevo
                Thread.sleep(1000); // 1 segundo de espera
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
