package  ma.zs.stocky.ws.facade.admin.effet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.stocky.bean.core.effet.TypePaiement;
import ma.zs.stocky.dao.criteria.core.effet.TypePaiementCriteria;
import ma.zs.stocky.service.facade.admin.effet.TypePaiementAdminService;
import ma.zs.stocky.ws.converter.effet.TypePaiementConverter;
import ma.zs.stocky.ws.dto.effet.TypePaiementDto;
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
@RequestMapping("/api/admin/typePaiement/")
public class TypePaiementRestAdmin  extends AbstractController<TypePaiement, TypePaiementDto, TypePaiementCriteria, TypePaiementAdminService, TypePaiementConverter> {



    @Operation(summary = "upload one typePaiement")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple typePaiements")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all typePaiements")
    @GetMapping("")
    public ResponseEntity<List<TypePaiementDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all typePaiements")
    @GetMapping("optimized")
    public ResponseEntity<List<TypePaiementDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a typePaiement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypePaiementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  typePaiement")
    @PostMapping("")
    public ResponseEntity<TypePaiementDto> save(@RequestBody TypePaiementDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  typePaiement")
    @PutMapping("")
    public ResponseEntity<TypePaiementDto> update(@RequestBody TypePaiementDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of typePaiement")
    @PostMapping("multiple")
    public ResponseEntity<List<TypePaiementDto>> delete(@RequestBody List<TypePaiementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified typePaiement")
    @DeleteMapping("")
    public ResponseEntity<TypePaiementDto> delete(@RequestBody TypePaiementDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified typePaiement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple typePaiements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "Finds typePaiements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypePaiementDto>> findByCriteria(@RequestBody TypePaiementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated typePaiements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypePaiementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports typePaiements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypePaiementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets typePaiement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypePaiementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TypePaiementRestAdmin (TypePaiementAdminService service, TypePaiementConverter converter) {
        super(service, converter);
    }




}
