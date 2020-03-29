package br.com.fiap.eye.job.entity;

import javax.validation.constraints.NotBlank;

public class Companies extends User {
	
	@NotBlank(message = "cnpj obrigatorio!")
	private long cnpj;
	
	private String site_url;

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getSite_url() {
		return site_url;
	}

	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + ((site_url == null) ? 0 : site_url.hashCode());
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
		Companies other = (Companies) obj;
		if (cnpj != other.cnpj)
			return false;
		if (site_url == null) {
			if (other.site_url != null)
				return false;
		} else if (!site_url.equals(other.site_url))
			return false;
		return true;
	}
	
	
}
