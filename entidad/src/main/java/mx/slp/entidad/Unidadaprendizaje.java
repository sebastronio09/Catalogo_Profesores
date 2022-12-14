/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.slp.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ghots
 */
@Entity
@Table(name = "unidadaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadaprendizaje.findAll", query = "SELECT u FROM Unidadaprendizaje u")
    , @NamedQuery(name = "Unidadaprendizaje.findByIdUA", query = "SELECT u FROM Unidadaprendizaje u WHERE u.idUA = :idUA")
    , @NamedQuery(name = "Unidadaprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM Unidadaprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "Unidadaprendizaje.findByNombre", query = "SELECT u FROM Unidadaprendizaje u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasClase", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasTaller", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasLaboratorio", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class Unidadaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUA")
    private Integer idUA;
    @Basic(optional = false)
    @Column(name = "IdUnidadAprendizaje")
    private int idUnidadAprendizaje;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "HorasClase")
    private int horasClase;
    @Basic(optional = false)
    @Column(name = "HorasTaller")
    private int horasTaller;
    @Basic(optional = false)
    @Column(name = "HorasLaboratorio")
    private int horasLaboratorio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUA")
    private List<Profesorimparteunidad> profesorimparteunidadList;

    public Unidadaprendizaje() {
    }

    public Unidadaprendizaje(Integer idUA) {
        this.idUA = idUA;
    }

    public Unidadaprendizaje(Integer idUA, int idUnidadAprendizaje, String nombre, int horasClase, int horasTaller, int horasLaboratorio) {
        this.idUA = idUA;
        this.idUnidadAprendizaje = idUnidadAprendizaje;
        this.nombre = nombre;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLaboratorio = horasLaboratorio;
    }

    public Integer getIdUA() {
        return idUA;
    }

    public void setIdUA(Integer idUA) {
        this.idUA = idUA;
    }

    public int getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(int idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public List<Profesorimparteunidad> getProfesorimparteunidadList() {
        return profesorimparteunidadList;
    }

    public void setProfesorimparteunidadList(List<Profesorimparteunidad> profesorimparteunidadList) {
        this.profesorimparteunidadList = profesorimparteunidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUA != null ? idUA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadaprendizaje)) {
            return false;
        }
        Unidadaprendizaje other = (Unidadaprendizaje) object;
        if ((this.idUA == null && other.idUA != null) || (this.idUA != null && !this.idUA.equals(other.idUA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.slp.entidad.Unidadaprendizaje[ idUA=" + idUA + " ]";
    }
    
}
