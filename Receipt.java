class Receipt {
	int id;
	Receipt name;
	double price;
	char tip;
	Item(int id, double price, char tip){
	    	this->id = id;
	    	this->price = price;
	    	strcpy(this->tip,tip);
	}
	//TODO setters and getters
	void setid (int k) {   
        id = k;   
    }
	char getName() {
		return name;
	}
	int cena(Receipt r) {
		cena+=cena;	
	}
	int getID() {
		return id;
	}
	double iznos() {
		return cena();
	}
	double taxReturn () {
		cout<<getID()<<getName()<<getprice()<<endl;
		//TODO
	}
}