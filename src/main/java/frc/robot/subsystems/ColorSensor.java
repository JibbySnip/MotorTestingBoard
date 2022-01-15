import com.revrobotics.ColorSensorV3;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;

public class sensorTest {
  private ColorSensorV3 testSensor;

  public ColorSensor {
    colorSensor = new ColorSensorV3(I2C.Port.kOnboard);
  }

  public void colorOuput {
    SmartDashboard.putNumber("Red", colorSensor.getRed());
    SmartDashboard.putNumber("Green", colorSensor.getGreen());
    SmartDashboard.putNumber("Blue", colorSensor.getBlue());
    SmartDashboard.putNumber("Color", colorSensor.getColor());
  }

  public Color getColor() {
    return colorSensor.getColor();
  }

  public double getIR(){
    return colorSensor.getIR();
  }

  @Override
    public void periodic(){
      updateValues();
    }
}