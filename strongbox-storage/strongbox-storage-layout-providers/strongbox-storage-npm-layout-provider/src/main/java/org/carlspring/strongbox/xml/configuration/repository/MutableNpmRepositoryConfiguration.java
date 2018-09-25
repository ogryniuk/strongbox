package org.carlspring.strongbox.xml.configuration.repository;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.carlspring.strongbox.xml.repository.CustomRepositoryConfiguration;
import org.carlspring.strongbox.xml.repository.MutableCustomRepositoryConfiguration;

/**
 * @author carlspring
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "npm-repository-configuration")
public class MutableNpmRepositoryConfiguration
        extends MutableCustomRepositoryConfiguration
{


    public MutableNpmRepositoryConfiguration()
    {
    }

    @Override
    public CustomRepositoryConfiguration getImmutable()
    {
        return new NpmRepositoryConfiguration(this);
    }
}
