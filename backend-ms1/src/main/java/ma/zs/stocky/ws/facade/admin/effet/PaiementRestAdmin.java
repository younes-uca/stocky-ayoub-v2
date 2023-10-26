package  ma.zs.stocky.ws.facade.admin.effet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.stocky.bean.core.effet.Paiement;
import ma.zs.stocky.dao.criteria.core.effet.PaiementCriteria;
import ma.zs.stocky.service.facade.admin.effet.PaiementAdminService;
import ma.zs.stocky.ws.converter.effet.PaiementConverter;
import ma.zs.stocky.ws.dto.effet.PaiementDto;
import ma.zs.stocky.zynerator.controller.AbstractController;
import ma.zs.stocky.zynerator.dto.AuditEntityDto;
import ma.zs.stocky.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.stocky.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.stocky.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/paiement/")
public class PaiementRestAdmin  extends AbstractController<Paiement, PaiementDto, PaiementCriteria, PaiementAdminService, PaiementConverter> {



    @Operation(summary = "upload one paiement")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple paiements")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all paiements")
    @GetMapping("")
    public ResponseEntity<List<PaiementDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all paiements")
    @GetMapping("optimized")
    public ResponseEntity<List<PaiementDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a paiement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PaiementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  paiement")
    @PostMapping("")
    public ResponseEntity<PaiementDto> save(@RequestBody PaiementDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  paiement")
    @PutMapping("")
    public ResponseEntity<PaiementDto> update(@RequestBody PaiementDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of paiement")
    @PostMapping("multiple")
    public ResponseEntity<List<PaiementDto>> delete(@RequestBody List<PaiementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified paiement")
    @DeleteMapping("")
    public ResponseEntity<PaiementDto> delete(@RequestBody PaiementDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified paiement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple paiements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by proprietaireChequeEffet id")
    @GetMapping("proprietaireChequeEffet/id/{id}")
    public List<PaiementDto> findByProprietaireChequeEffetId(@PathVariable Long id){
        return findDtos(service.findByProprietaireChequeEffetId(id));
    }
    @Operation(summary = "delete by proprietaireChequeEffet id")
    @DeleteMapping("proprietaireChequeEffet/id/{id}")
    public int deleteByProprietaireChequeEffetId(@PathVariable Long id){
        return service.deleteByProprietaireChequeEffetId(id);
    }
    @Operation(summary = "find by compte id")
    @GetMapping("compte/id/{id}")
    public List<PaiementDto> findByCompteId(@PathVariable Long id){
        return findDtos(service.findByCompteId(id));
    }
    @Operation(summary = "delete by compte id")
    @DeleteMapping("compte/id/{id}")
    public int deleteByCompteId(@PathVariable Long id){
        return service.deleteByCompteId(id);
    }
    @Operation(summary = "find by typePaiement id")
    @GetMapping("typePaiement/id/{id}")
    public List<PaiementDto> findByTypePaiementId(@PathVariable Long id){
        return findDtos(service.findByTypePaiementId(id));
    }
    @Operation(summary = "delete by typePaiement id")
    @DeleteMapping("typePaiement/id/{id}")
    public int deleteByTypePaiementId(@PathVariable Long id){
        return service.deleteByTypePaiementId(id);
    }
    @Operation(summary = "find by beneficiaire id")
    @GetMapping("beneficiaire/id/{id}")
    public List<PaiementDto> findByBeneficiaireId(@PathVariable Long id){
        return findDtos(service.findByBeneficiaireId(id));
    }
    @Operation(summary = "delete by beneficiaire id")
    @DeleteMapping("beneficiaire/id/{id}")
    public int deleteByBeneficiaireId(@PathVariable Long id){
        return service.deleteByBeneficiaireId(id);
    }
    @Operation(summary = "Finds paiements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PaiementDto>> findByCriteria(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated paiements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports paiements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets paiement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public PaiementRestAdmin (PaiementAdminService service, PaiementConverter converter) {
        super(service, converter);
    }




}
