/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Oct 18, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Identification;

@Repository
public interface IdentificationRepository extends JpaRepository<Identification, Long> {
}