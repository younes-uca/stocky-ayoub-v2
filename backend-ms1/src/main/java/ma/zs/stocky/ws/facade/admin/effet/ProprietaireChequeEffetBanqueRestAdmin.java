package  ma.zs.stocky.ws.facade.admin.effet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffetBanque;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetBanqueCriteria;
import ma.zs.stocky.service.facade.admin.effet.ProprietaireChequeEffetBanqueAdminService;
import ma.zs.stocky.ws.converter.effet.ProprietaireChequeEffetBanqueConverter;
import ma.zs.stocky.ws.dto.effet.ProprietaireChequeEffetBanqueDto;
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
@RequestMapping("/api/admin/proprietaireChequeEffetBanque/")
public class ProprietaireChequeEffetBanqueRestAdmin  extends AbstractController<ProprietaireChequeEffetBanque, ProprietaireChequeEffetBanqueDto, ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanqueAdminService, ProprietaireChequeEffetBanqueConverter> {



    @Operation(summary = "upload one proprietaireChequeEffetBanque")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple proprietaireChequeEffetBanques")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all proprietaireChequeEffetBanques")
    @GetMapping("")
    public ResponseEntity<List<ProprietaireChequeEffetBanqueDto>> findAll() throws Exception {
        return super.findAll();
    }


    @Operation(summary = "Finds a proprietaireChequeEffetBanque by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProprietaireChequeEffetBanqueDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  proprietaireChequeEffetBanque")
    @PostMapping("")
    public ResponseEntity<ProprietaireChequeEffetBanqueDto> save(@RequestBody ProprietaireChequeEffetBanqueDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  proprietaireChequeEffetBanque")
    @PutMapping("")
    public ResponseEntity<ProprietaireChequeEffetBanqueDto> update(@RequestBody ProprietaireChequeEffetBanqueDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of proprietaireChequeEffetBanque")
    @PostMapping("multiple")
    public ResponseEntity<List<ProprietaireChequeEffetBanqueDto>> delete(@RequestBody List<ProprietaireChequeEffetBanqueDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified proprietaireChequeEffetBanque")
    @DeleteMapping("")
    public ResponseEntity<ProprietaireChequeEffetBanqueDto> delete(@RequestBody ProprietaireChequeEffetBanqueDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified proprietaireChequeEffetBanque")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple proprietaireChequeEffetBanques by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by proprietaireChequeEffet id")
    @GetMapping("proprietaireChequeEffet/id/{id}")
    public List<ProprietaireChequeEffetBanqueDto> findByProprietaireChequeEffetId(@PathVariable Long id){
        return findDtos(service.findByProprietaireChequeEffetId(id));
    }
    @Operation(summary = "delete by proprietaireChequeEffet id")
    @DeleteMapping("proprietaireChequeEffet/id/{id}")
    public int deleteByProprietaireChequeEffetId(@PathVariable Long id){
        return service.deleteByProprietaireChequeEffetId(id);
    }
    @Operation(summary = "find by banque id")
    @GetMapping("banque/id/{id}")
    public List<ProprietaireChequeEffetBanqueDto> findByBanqueId(@PathVariable Long id){
        return findDtos(service.findByBanqueId(id));
    }
    @Operation(summary = "delete by banque id")
    @DeleteMapping("banque/id/{id}")
    public int deleteByBanqueId(@PathVariable Long id){
        return service.deleteByBanqueId(id);
    }
    @Operation(summary = "find by compte id")
    @GetMapping("compte/id/{id}")
    public List<ProprietaireChequeEffetBanqueDto> findByCompteId(@PathVariable Long id){
        return findDtos(service.findByCompteId(id));
    }
    @Operation(summary = "delete by compte id")
    @DeleteMapping("compte/id/{id}")
    public int deleteByCompteId(@PathVariable Long id){
        return service.deleteByCompteId(id);
    }
    @Operation(summary = "Finds proprietaireChequeEffetBanques by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProprietaireChequeEffetBanqueDto>> findByCriteria(@RequestBody ProprietaireChequeEffetBanqueCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated proprietaireChequeEffetBanques by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProprietaireChequeEffetBanqueCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports proprietaireChequeEffetBanques by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProprietaireChequeEffetBanqueCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets proprietaireChequeEffetBanque data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProprietaireChequeEffetBanqueCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public ProprietaireChequeEffetBanqueRestAdmin (ProprietaireChequeEffetBanqueAdminService service, ProprietaireChequeEffetBanqueConverter converter) {
        super(service, converter);
    }




}
