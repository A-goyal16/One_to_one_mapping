package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country
{
	@Id
	int id;
	String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public PrimeMinister getPm() {
		return pm;
	}

	public void setPm(PrimeMinister pm) {
		this.pm = pm;
	}

	String population;
	
	@OneToOne
	PrimeMinister pm;
}
