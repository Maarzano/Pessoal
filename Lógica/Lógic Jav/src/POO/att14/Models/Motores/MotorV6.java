package att14.Models.Motores;

import att14.Contracts.IMotor;
import att14.enums.EMotores;

public class MotorV6 implements IMotor{

    @Override
    public EMotores getMotor() {
        return EMotores.V6;
    }

}
