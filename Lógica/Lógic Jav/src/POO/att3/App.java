package att3;

import java.util.ArrayList;
import java.util.List;

import att3.Models.Student;
import att3.Models.Teacher;
import att3.Service.PaymentService;
import att3.vehicle.Bike;
import att3.vehicle.Car;
import att3.vehicle.Vehicle;
import att3.Contracts.IDrivable;
import att3.Contracts.IPayable;

public class App {
    public static void main(String[] args) {

        List<Student> lista = new ArrayList<>();
        PaymentService paymentService = new PaymentService();
        lista.add(new Student("João", 20, 7.5, 500));
        lista.add(new Student("Maria", 22, 8.9, 100));

        Teacher professor = new Teacher("Arthur", 45, lista);

        System.out.println(professor.teach());
        System.out.println(professor.teach(lista.get(0)));

        professor.notify("Você tem uma reunião amanhã.");

        Vehicle carro = new Car("ABC-1234");
        Vehicle moto = new Bike("XYZ-9876");

        System.out.println(carro.start());
        System.out.println(moto.start());

        IDrivable d1 = carro;
        IDrivable d2 = moto;
        System.out.println(d1.drive());
        System.out.println(d2.drive());

        if (carro instanceof Car) {
            Car c = (Car) carro;
            System.out.println(c.openDoor());
        }
        IPayable s1 = lista.get(0);
        System.out.println("Pagamento João: " + s1.pay(30));
        System.out.println("Pagamento João: " + s1.pay(-80));

        List<IPayable> listaPayables = new ArrayList<>();
        listaPayables.addAll(lista);

        for (var vari : listaPayables){
            paymentService.proccesPayment(vari, 101);
        }

        List<Object> teste = new ArrayList<>();

        teste.addAll(listaPayables);
        teste.addAll(lista);
        System.out.println("TESTE");
        for (var obj : teste){
            System.out.println(obj.toString());
        }
    }
}
