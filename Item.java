class Item {
	int id;
	String name;
	double price;
	char tip;
	int Danok() {
		if tip=="A" return 18;
		if tip=="B" return 5;
		if tip=="V" return 0;
	}
	//TODO constructor
	Item(int id, double price, char tip){
	    	this->id = id;
	    	this->price = price;
	    	strcpy(this->tip,tip);
	}
	//TODO setters and getters
	void setid (int k) {   
        id = k;   
    }
	void setname (char k) {   
       strcpy(k,name);   
	}
	void setp (double k) {   
        price = k;   
    }
	int getID() {
		return id;
	}
	int getName() {
		return name;
	}
	double getprice() {
		return price;
	}
	double taxReturn () {
		cout<<getID()<<getName()<<getprice()*0.15<<endl;
		//TODO
	}
}