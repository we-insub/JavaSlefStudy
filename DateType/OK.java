import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OK {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String id = "화곡동 1053-10" ; 이렇게 해도되지만 매번id 값 변경귀찮으니까
//		id 값을 인풋으로 입력받는다면?
		String id =JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a bright");
//		위에 값은 스트링형이고  36 번라인의 데이터 형식은 더블형이다 캐싱해야함
//		스프링 - 더블 
		
		
		// Elevator Call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //1층으로 엘리베이터 보내
		
		
		// Security off 
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		// Light on
		Lighting hallLamp = new Lighting(id+"/ Hall Lamp");
		hallLamp.on();

		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
//		moodLamp.setBright(bright); 더블형임 
		moodLamp.setBright(Double.parseDouble(bright));
//		birght 는 스트링인데 Double 을 지나면서 더블형으로 바뀜 
		moodLamp.on();
		
	}

}
