package epam.house_cost;
class Construction
{
	int standard,house_area;
	Construction(int std,int area)
	{
		standard=std;
		house_area=area;
	}
	void calculateCost()
	{
		if(standard==1)
			System.out.println("Construction Cost: "+house_area*12000);
		else if(standard==2)
			System.out.println("Construction Cost: "+house_area*15000);
		else if(standard==3)
			System.out.println("Construction Cost:"+house_area*18000);
		else
			System.out.println("Construction Cost:"+house_area*25000);
	}
}


