package betaben.question;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {

	private List<ClimbInfo> climbList;
	
	public ClimbingClub(){
		climbList = new ArrayList<>();
	}
	
	// A
	
//	public void addClimb(String peakName, int climbTime){
//		climbList.add(new ClimbInfo(peakName, climbTime));
//	}
	
	// B
	
	public void addClimb(String peakName, int climbTime){
		System.out.println(peakName);
		for(ClimbInfo i : climbList){
//			System.out.println(climbList.get(climbList.indexOf(i)).getName());
			System.out.println(peakName);
//			if(climbList.isEmpty()){
//				climbList.add(new ClimbInfo(peakName, climbTime));
//				break;
//			}
//			if(peakName.compareTo(i.getName()) == 0){
//				climbList.add(climbList.indexOf(i), new ClimbInfo(peakName, climbTime));
//			}
//			if(peakName.compareTo(i.getName()) > 0){
//				climbList.add(climbList.indexOf(i)+1, new ClimbInfo(peakName, climbTime));
//			}
			
		}
	}

	// C
	
//	public int distinctPeakNames(){
//		
//	}
	
}