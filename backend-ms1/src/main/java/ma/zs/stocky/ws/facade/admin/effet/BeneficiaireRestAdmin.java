package  ma.zs.stocky.ws.facade.admin.effet;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.stocky.bean.core.effet.Beneficiaire;
import ma.zs.stocky.dao.criteria.core.effet.BeneficiaireCriteria;
import ma.zs.stocky.service.facade.admin.effet.BeneficiaireAdminService;
import ma.zs.stocky.ws.converter.effet.BeneficiaireConverter;
import ma.zs.stocky.ws.dto.effet.BeneficiaireDto;
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
@RequestMapping("/api/admin/beneficiaire/")
public class BeneficiaireRestAdmin  extends AbstractController<Beneficiaire, BeneficiaireDto, BeneficiaireCriteria, BeneficiaireAdminService, BeneficiaireConverter> {



    @Operation(summary = "upload one beneficiaire")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple beneficiaires")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all beneficiaires")
    @GetMapping("")
    public ResponseEntity<List<BeneficiaireDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all beneficiaires")
    @GetMapping("optimized")
    public ResponseEntity<List<BeneficiaireDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a beneficiaire by id")
    @GetMapping("id/{id}")
    public ResponseEntity<BeneficiaireDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @Operation(summary = "Saves the specified  beneficiaire")
    @PostMapping("")
    public ResponseEntity<BeneficiaireDto> save(@RequestBody BeneficiaireDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  beneficiaire")
    @PutMapping("")
    public ResponseEntity<BeneficiaireDto> update(@RequestBody BeneficiaireDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of beneficiaire")
    @PostMapping("multiple")
    public ResponseEntity<List<BeneficiaireDto>> delete(@RequestBody List<BeneficiaireDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified beneficiaire")
    @DeleteMapping("")
    public ResponseEntity<BeneficiaireDto> delete(@RequestBody BeneficiaireDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified beneficiaire")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple beneficiaires by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "Finds beneficiaires by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<BeneficiaireDto>> findByCriteria(@RequestBody BeneficiaireCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated beneficiaires by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody BeneficiaireCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports beneficiaires by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody BeneficiaireCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets beneficiaire data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody BeneficiaireCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public BeneficiaireRestAdmin (BeneficiaireAdminService service, BeneficiaireConverter converter) {
        super(service, converter);
    }




}
