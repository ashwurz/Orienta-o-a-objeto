#include <string>

using namespace std;

class Invoice
{
	public:
		Invoice(string ident, string desc, int quant, int preco);
		int getInvoiceAmount(int a, int b);
		void setIdent(string ident);
		void setDesc(string desc);
		void setQuant(int quant);
		void setPreco(int preco);
		string getIdent();
		string getDesc();
		int getQuant();
		int getPreco();
	
	private:
		string ident;
		string desc;
		int quant;
		int preco;
};
