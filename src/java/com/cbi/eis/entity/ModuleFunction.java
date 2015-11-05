package com.cbi.eis.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity()
@Table(name = "module")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ModuleFunction {
	private String id;
	private String name;
	private List<ModuleFunction> moduleFunctions;
	private ModuleFunction moduleFunction;
	private Descriptor moduleDescriptor;
	private String icon;
	private int sorting;
	private String parent;

	@Id() @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "descriptor_id")
	public Descriptor getModuleDescriptor() {
		return moduleDescriptor;
	}

	public void setModuleDescriptor(Descriptor moduleDescriptor) {
		this.moduleDescriptor = moduleDescriptor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name = "iparent", nullable = true, updatable = true, insertable = true)
	public ModuleFunction getModuleFunction() {
		return moduleFunction;
	}

	public void setModuleFunction(ModuleFunction moduleFunction) {
		this.moduleFunction = moduleFunction;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public int getSorting() {
		return sorting;
	}
	
	public void setSorting(int sorting) {
		this.sorting = sorting;
	}
	
	@Column(name="is_parent")
	public String getParent() {
		return parent;
	}
	
	public void setParent(String parent) {
		this.parent = parent;
	}

	@OneToMany(mappedBy = "moduleFunction", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	public List<ModuleFunction> getModuleFunctions() {
		return moduleFunctions;
	}

	public void setModuleFunctions(List<ModuleFunction> moduleFunctions) {
		this.moduleFunctions = moduleFunctions;
	}

}
