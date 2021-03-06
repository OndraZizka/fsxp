
package collada;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"asset", "convexMesh", "mesh", "spline", "extra"})
@XmlRootElement(name="geometry")
public class Geometry
{
  protected Asset asset;
  @XmlElement(name="convex_mesh")
  protected ConvexMesh convexMesh;
  protected Mesh mesh;
  protected Spline spline;
  protected List<Extra> extra;
  @XmlAttribute
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  protected String id;
  @XmlAttribute
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String name;
  public Asset getAsset()
  {
    return this.asset;
  }
  public void setAsset(Asset value)
  {
    this.asset = value;
  }
  public ConvexMesh getConvexMesh()
  {
    return this.convexMesh;
  }
  public void setConvexMesh(ConvexMesh value)
  {
    this.convexMesh = value;
  }
  public Mesh getMesh()
  {
    return this.mesh;
  }
  public void setMesh(Mesh value)
  {
    this.mesh = value;
  }
  public Spline getSpline()
  {
    return this.spline;
  }
  public void setSpline(Spline value)
  {
    this.spline = value;
  }
  public List<Extra> getExtra()
  {
    if (this.extra == null)
      this.extra = new ArrayList();
    return this.extra;
  }
  public String getId()
  {
    return this.id;
  }
  public void setId(String value)
  {
    this.id = value;
  }
  public String getName()
  {
    return this.name;
  }
  public void setName(String value)
  {
    this.name = value;
  }
}

