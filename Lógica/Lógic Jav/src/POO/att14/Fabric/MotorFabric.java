package att14.Fabric;

import att14.Contracts.IMotor;
import att14.Models.Motores.MotorEletrico;
import att14.Models.Motores.MotorTurbo;
import att14.Models.Motores.MotorV6;
import att14.enums.EMotores;

public class MotorFabric {
    public static IMotor montarMotor(EMotores tipo){
        switch (tipo) {
            case V6:
                return new MotorV6();
            case ELETRICO:
                return new MotorEletrico();
            case TURBO:
                return new MotorTurbo();
            default:
                throw new IllegalArgumentException("Tipo de motor errado");
        }
    }
}
