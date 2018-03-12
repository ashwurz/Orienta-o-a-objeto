#include <string>

using namespace std;

class Complex
{
	public:
		Complex(double real, double imaginario);
		double complexSoma1(double a, double b);
		double complexSoma2(double c, double d);
		double complexSubtrai1(double e, double f);
		double complexSubtrai2(double g, double h);
		void complexImprime(double i, double j);
		void setReal(double real);
		void setImaginario(double imaginario);
		double getReal();
		double getImaginario();
	private:
		double real;
		double imaginario;	
}; 
