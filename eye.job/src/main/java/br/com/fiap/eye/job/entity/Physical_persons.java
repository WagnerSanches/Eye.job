package br.com.fiap.eye.job.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;

public class Physical_persons extends User {
	
	@NotBlank(message = "cpf obrigatorio!")
	private long cpf;
	
	@NotBlank(message = "Data de nascimento obrigatorio!")
	private Date birthday;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Physical_persons other = (Physical_persons) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	
	
}
