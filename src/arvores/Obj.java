package arvores;

import java.util.Objects;

public class Obj extends objArvore<Obj> {

	Integer meuvalor;
	
	public Obj(Integer meuvalor) {
		this.meuvalor = meuvalor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(meuvalor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return Objects.equals(meuvalor, other.meuvalor);
	}

	@Override
	public int compareTo(Obj outro) {
		int i = 0;
		if(this.meuvalor > outro.meuvalor) {
			i =1;
		}else if(this.meuvalor < outro.meuvalor) {
			i =-1;
		}
		return i;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return meuvalor.toString();
	}
	
	
	
	
	
	
}
